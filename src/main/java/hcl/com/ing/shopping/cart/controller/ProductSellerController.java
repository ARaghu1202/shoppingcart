package hcl.com.ing.shopping.cart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hcl.com.ing.shopping.cart.entity.ProductSeller;
import hcl.com.ing.shopping.cart.service.ProductSellerService;

/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this ProductSellerController - is used to do the all the REST API calls on - ProductsSeller 
 */

@RestController
@RequestMapping("/productsellers")
public class ProductSellerController {

	/*
	 * Creating the ProductSellerService object to call respective service
	 */
	
	@Autowired
	private ProductSellerService productSellerService;
	
	/*
	 * This method is used for to get all the product sellers and provide as List of Product Sellers as response
	 * @return List of ProductSeller
	 * @return List of ProductSeller
	 */
	
	@GetMapping("")
	public ResponseEntity<List<ProductSeller>> getAllProductSellers(){
		List<ProductSeller> productSellers =  productSellerService.findAllProductSellers();
		return new ResponseEntity<>(productSellers, HttpStatus.OK);
	}
	
	/*
	 * This method is used for to get the product sellers details based on the input sellerId variable and provides ProductSeller response
	 * @input sellerId
	 * @return List of Products
	 */
	
	@GetMapping("/{sellerId}")
	public ResponseEntity<Optional<ProductSeller>> getProductSellerById(@PathVariable Integer sellerId){
		Optional<ProductSeller> productSeller =  productSellerService.findProductSellerById(sellerId);
		return new ResponseEntity<>(productSeller, HttpStatus.OK);
	}
	
	/*
	 * This below - createProductSeller - method is used to save the entire ProductSeller object into respective Data base
	 * @input ProductSeller
	 * @return String
	 */
	
	@PutMapping("")
	public ResponseEntity<String> createProductSeller(@RequestBody ProductSeller productSeller){
		String productSellerResponse =  productSellerService.saveProductSeller(productSeller);
		return new ResponseEntity<>(productSellerResponse, HttpStatus.OK);
	}
}
