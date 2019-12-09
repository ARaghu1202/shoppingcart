package hcl.com.ing.shopping.cart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hcl.com.ing.shopping.cart.entity.User;
import hcl.com.ing.shopping.cart.service.UserService;


/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this ProductController - is used to do the all the REST API calls on - Products 
 */

@RestController
@RequestMapping("/users")
public class UserController {
	
	 /*
	  * Creating the UsersService object to call respective service
	  */
	
	@Autowired
	public UserService userService;
	
	/*
	 * This below - createProduct - method is used to save the entire Users object into respective Data base
	 * @input Users
	 * @return String
	 */
	
	@PostMapping("")
	public ResponseEntity<String> createUser(@RequestBody User user) {
		
		String response = userService.saveUser(user);
		
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	/*
	 * This method is used for to get all the Users and provide as List of Users as response
	 * @return List of Users
	 */
	
	@GetMapping("")
	public ResponseEntity<List<User>> getAllUsers(){
		
		List<User> response = userService.findAllUsers();
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	/*
	 * This method is used for to get all the product details based on the input id/userId variable as response
	 * @input userId
	 * @return Optional of Users
	 */
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<User>> getUser(@PathVariable Integer id) {
		Optional<User> response = userService.findUserById(id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
