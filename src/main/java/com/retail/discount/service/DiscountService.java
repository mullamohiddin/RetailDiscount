package com.retail.discount.service;

import com.retail.discount.Bill;
import com.retail.discount.User;
public interface DiscountService {

	public double getDicountAmount(User user);
	public Bill getPayableAmount(User user);
	public int getDiscount(User user);
}
