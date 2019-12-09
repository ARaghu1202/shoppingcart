package hcl.com.ing.shopping.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hcl.com.ing.shopping.cart.entity.UserAddress;
import hcl.com.ing.shopping.cart.repository.UserAddressRepository;
/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this UserAddressService - is used to do the business logic implementations for UserAddress
 */
@Service
public class UserAddressService {
	
	/*
	 *  Creating the UserAddressRepository object to call respective repository
	 */
	@Autowired
	private UserAddressRepository userAddressRepository;
	
   /*
	*  This service method is use for fetch the fetch all UserAddress Objects
	*/
	public List<UserAddress> getUserContact(){
		return userAddressRepository.findAll();
	}
}
