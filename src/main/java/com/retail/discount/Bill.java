package com.retail.discount;

public class Bill {

	String billNo;
	int discountPercent;
	double discountAmount;
	double billAmount;
	double payableAmount;
	String userId;
	
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String string) {
		this.billNo = string;
	}
	public int getDiscount() {
		return discountPercent;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public double getPayableAmount() {
		return payableAmount;
	}
	public void setPayableAmount(double payableAmount) {
		this.payableAmount = payableAmount;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	
}
