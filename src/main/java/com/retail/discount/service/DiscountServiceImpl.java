package com.retail.discount.service;

import org.springframework.stereotype.Service;

import com.retail.discount.Bill;
import com.retail.discount.USER_TYPE;
import com.retail.discount.User;

@Service
public class DiscountServiceImpl implements DiscountService{

	@Override
	public double getDicountAmount(User user) {
		if( (USER_TYPE.EMPLOYEE.getValue()).equals(user.getUserType())) {
			return (user.getAmount() * 30)/100;
		}
		else if ((USER_TYPE.AFFLIATE.getValue()).equals(user.getUserType())) {
			return (user.getAmount() * 10)/100;
		} else if ((USER_TYPE.OLD_CUST.getValue()).equals(user.getUserType())) {
			return (user.getAmount() * 5)/100;
		} else if (user.getAmount() >= 100) {
			int value = (int) (user.getAmount()/100);
			return (double)(value * 5);
		}
		return user.getAmount();
		
	}

	@Override
	public Bill getPayableAmount(User user) {
		double discountAmount = getDicountAmount(user);
		double payableAmount = user.getAmount() - discountAmount;
		Bill bill =new Bill();
		bill.setBillNo(user.getBillNo());
		bill.setBillAmount(user.getAmount());
		bill.setDiscountAmount(discountAmount);
		bill.setPayableAmount(payableAmount);
		bill.setDiscountPercent(getDiscount(user));
		bill.setUserId(user.getUserName());
		return bill;
	}

	@Override
	public int getDiscount(User user) {
		if( (USER_TYPE.EMPLOYEE.getValue()).equals(user.getUserType())) {
			return 30;
		}
		else if ((USER_TYPE.AFFLIATE.getValue()).equals(user.getUserType())) {
			return 10;
		} else if ((USER_TYPE.OLD_CUST.getValue()).equals(user.getUserType())) {
			return 5;
		}
		return 0;
	}

	
}
