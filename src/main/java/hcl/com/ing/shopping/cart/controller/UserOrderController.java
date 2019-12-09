package hcl.com.ing.shopping.cart.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this ProductController - is used to do the all the REST API class on - Products 
 */


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hcl.com.ing.shopping.cart.entity.UserOrder;
import hcl.com.ing.shopping.cart.service.UserOrderService;

/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this UserOrderController - is used to do the all the REST API calls on - UserOrder 
 */

@RestController
@RequestMapping("/userorders")
public class UserOrderController {
	
	@Autowired
	private UserOrderService userOrderService;
	
	/*
	 * This below - purchageProduct - method is used to save the entire UserOrder object into respective Data base
	 * @input Product
	 * @return String
	 */

	@PostMapping("/orderproduct")
	private ResponseEntity<String> purchageProduct(@RequestBody UserOrder userOrder) {
			String userOrderResponse = userOrderService.orderPoduct(userOrder);
			return new ResponseEntity<>(userOrderResponse, HttpStatus.CREATED);
	}

}
