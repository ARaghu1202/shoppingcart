package hcl.com.ing.shopping.cart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hcl.com.ing.shopping.cart.constants.ShoppingCartConstants;
import hcl.com.ing.shopping.cart.entity.User;
import hcl.com.ing.shopping.cart.repository.UserRepository;

/*
* @author  AKUTHOTA.RAGHU 
* @version 1.0
* @since   2019-11-24 
* Here, this UsersService - is used to do the business logic implementations for Users
*/
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	// This service method is use for save the Users Object
	public String saveUser(User user) {
		userRepository.save(user);
		return ShoppingCartConstants.getOprationSuccess();
	}
	
	// This service method is use for fetch the Users Object
	public List<User> findAllUsers(){
		return userRepository.findAll();
	}
	
	// This service method is use for fetch the Users Object based on the input userId and returns single Users record 
	public Optional<User> findUserById(Integer userId) {
		return userRepository.findById(userId);
	}
}
