package hcl.com.ing.shopping.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hcl.com.ing.shopping.cart.entity.UserAddress;

/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this UserAddressRepository - This ProductRepository Repository is used to do all the specified JPA operations
 */
public interface UserAddressRepository extends JpaRepository<UserAddress, Integer>{
}
