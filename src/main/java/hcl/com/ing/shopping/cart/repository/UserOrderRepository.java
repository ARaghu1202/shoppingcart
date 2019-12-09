package hcl.com.ing.shopping.cart.repository;

/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-26 
 */

import org.springframework.data.jpa.repository.JpaRepository;

import hcl.com.ing.shopping.cart.entity.UserOrder;

public interface UserOrderRepository extends JpaRepository<UserOrder, Integer>{

}
