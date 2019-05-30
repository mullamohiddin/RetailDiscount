package com.retail.discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.retail.discount.service.DiscountService;

@RestController
@RequestMapping("/api/rest/retail/")
public class DiscountController {

	 @Autowired
	 DiscountService discountService;
	 @RequestMapping(value = "/bill", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Bill> getPayableAmount(@RequestBody User requestObject) throws Exception {
		 Bill bill = discountService.getPayableAmount(requestObject);
		 return new ResponseEntity<>(bill, HttpStatus.OK);
		 
	 }
}
