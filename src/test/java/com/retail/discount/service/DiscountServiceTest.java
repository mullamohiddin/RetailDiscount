package com.retail.discount.service;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.retail.discount.Bill;
import com.retail.discount.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DiscountServiceImpl.class)
public class DiscountServiceTest  {
	@Autowired
	DiscountService discountService;
	User user;
	@Before
	public void setUp() {
		  MockitoAnnotations.initMocks(this);
		user = new User();
		user.setAmount(998);
		user.setBillNo("123");
		user.setUserName("Gouse");
		user.setUserType("Employee");;
	 }
	@Test
	public void getDicountAmount() {	 
		double discountAmount = discountService.getDicountAmount(user);
		Assert.assertEquals(299.4, discountAmount,0);
	 }
	 
	@Test
	public void getDiscount() {	 
		int discountPercent = discountService.getDiscount(user);
		Assert.assertEquals(30, discountPercent);
	 }
	@Test
	public void getPayableAmount() {	 
		Bill bill = discountService.getPayableAmount(user);
		Assert.assertEquals(698.6, bill.getPayableAmount(), 0);
	 }
}
