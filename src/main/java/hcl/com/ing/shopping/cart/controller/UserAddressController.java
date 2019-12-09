package hcl.com.ing.shopping.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hcl.com.ing.shopping.cart.entity.UserAddress;
import hcl.com.ing.shopping.cart.service.UserAddressService;


/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this UsersAddressController - is used to do the all the REST API calls on - Products 
 */

@RestController
@RequestMapping("/userscontacts")
public class UserAddressController {

	/*
	 * Creating the UsersAddressService object to call respective service
	 */
	
	@Autowired
	private UserAddressService userAddressService;
	
	
	/*
	 * This method is used for to get all the UsersAddress and provide as List of UsersAddress as response
	 * @return List of UsersAddress
	 */
	
	@GetMapping("")
	public ResponseEntity<List<UserAddress>> getUsersContact(){
		List<UserAddress> usersAddress =  userAddressService.getUserContact();
		return new ResponseEntity<>(usersAddress, HttpStatus.OK);
	}
}
