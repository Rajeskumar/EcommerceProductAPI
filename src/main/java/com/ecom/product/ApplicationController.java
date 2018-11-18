/**
 * 
 */
package com.ecom.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecom.product.domain.Product;
import com.ecom.product.service.ProductService;

/**
 * @author Rajeshkumar
 *
 */

@Controller
public class ApplicationController {
	
	@RequestMapping("/welcome")
	@ResponseBody
	public String welcomeMessage() {
		String msg = "Welcome User to Product Detail Page !!!";
		return msg;		
	}
	
	@RequestMapping("/product/{id}")
	@ResponseBody
	public Product getProductDetails(@PathVariable String id) {
		
		ProductService service = new ProductService();
		return service.getProductDetails(id);
	}

}
