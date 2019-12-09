package hcl.com.ing.shopping.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hcl.com.ing.shopping.cart.constants.ShoppingCartConstants;
import hcl.com.ing.shopping.cart.entity.Product;
import hcl.com.ing.shopping.cart.repository.ProductRepository;
/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this ProductService - is used to do the business logic implementations for Products
 */
@Service
public class ProductService {
	
	/*
	 *  Creating the ProductRepository object to call respective repository
	 */
	
	@Autowired
	private ProductRepository productRepository;
	
	/*
	 * This service method is use for save the Product Object
	 * @input product
	 * @return String
	 */
	
	public String saveProduct(Product product) {
			productRepository.save(product);
			return ShoppingCartConstants.getSavedSuccess();
	}
	
	/*
	 *  This service method is use for fetch the fetch all or List of Product Objects
	 */
	
	public List<Product> findAllProducts(){
		return productRepository.findAll();
	}
	
	/*
	 * This service method is use for fetch the Product Object based on the input productName 
	 * and returns List of Product ProductSeller record 
	 * @input productName
	 * @return List of Product
	 */
	public List<Product> findProductsByProductName(String productName){
		return productRepository.findByProductNameContains(productName);
	}
}
