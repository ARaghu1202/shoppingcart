package hcl.com.ing.shopping.cart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hcl.com.ing.shopping.cart.constants.ShoppingCartConstants;
import hcl.com.ing.shopping.cart.entity.ProductSeller;
import hcl.com.ing.shopping.cart.repository.ProductSellerRepository;
/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this ProductSellerService - is used to do the business logic implementations for ProductSellers
 */
@Service
public class ProductSellerService {
	
	/*
	 *  Creating the ProductSellerRepository object to call respective repository
	 */
	@Autowired
	private ProductSellerRepository productSellerRepository;
	
	/*
	 * This service method is use for save the ProductSeller Object
	 */
	public String saveProductSeller(ProductSeller productSeller) {
		productSellerRepository.save(productSeller);
		return ShoppingCartConstants.getOprationSuccess();
	}
	
	/*
	 *  This service method is use for fetch the fetch all ProductSeller Objects
	 */
	public List<ProductSeller> findAllProductSellers(){
		return productSellerRepository.findAll();
	}
	/*
	 * This service method is use for fetch the ProductSeller Object based on the input userId 
	 * and returns single Optional ProductSeller record 
	 */
	public Optional<ProductSeller> findProductSellerById(Integer sellerId) {
		return productSellerRepository.findById(sellerId);
	}

}
