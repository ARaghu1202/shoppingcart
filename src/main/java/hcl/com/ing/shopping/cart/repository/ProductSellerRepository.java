package hcl.com.ing.shopping.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hcl.com.ing.shopping.cart.entity.ProductSeller;

/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this ProductSellerRepository - This ProductRepository Repository is used to do all the specified JPA operations
 */
@Repository
public interface ProductSellerRepository extends JpaRepository<ProductSeller, Integer>{

}
