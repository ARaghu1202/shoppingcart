package hcl.com.ing.shopping.cart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hcl.com.ing.shopping.cart.entity.SellerRating;

/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this SellerRatingRepository - This ProductRepository Repository is used to do all the specified JPA operations
 */
@Repository
public interface SellerRatingRepository extends JpaRepository<SellerRating, Integer>{

	List<SellerRating> findByProductName(String productName);

}
