package com.retail.discount;

public enum USER_TYPE {

	EMPLOYEE("Employee"), AFFLIATE("affliate"), OLD_CUST("oldcustomer");
	private String userType;

	USER_TYPE(String s) {
		userType = s;
	}

	public String getValue() {
		return userType;
	}
}
