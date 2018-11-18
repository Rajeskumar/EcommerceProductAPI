/**
 * 
 */
package com.ecom.product.service;

import com.ecom.product.domain.Product;

/**
 * @author Rajeshkumar
 *
 */
public class ProductService {

	public Product getProductDetails(String id) {
		Product prod = new Product();
		
		if(id.equalsIgnoreCase("1")) {
			prod = new Product();
			prod.setId("1");
			prod.setPrdName("Tape");
			prod.setDesc("Sticky double sided tape for better stickng");
			prod.setCategory("HouseHold");
			prod.setRating(4);
		}
		return prod;
	}
}
