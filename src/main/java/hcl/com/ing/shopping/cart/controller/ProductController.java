package hcl.com.ing.shopping.cart.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hcl.com.ing.shopping.cart.entity.Product;
import hcl.com.ing.shopping.cart.service.ProductService;

/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this ProductController - is used to do the all the REST API calls on - Products 
 */

@RestController
@RequestMapping("/products")
public class ProductController {

	
	private static final Logger LOGGER = LogManager.getLogger(ProductController.class);
	
	/*
	 * Creating the ProductService object to call respective service
	 */
	
	@Autowired
	private ProductService productService;
	
	/*
	 * This method is used for to get all the products and provide as List of Products as response
	 * @return List of Products
	 * 
	 */
	
	@GetMapping("")
	public ResponseEntity<List<Product>> getAllProducts(){
		
		LOGGER.info("Info level log message - from ProductController");
		LOGGER.debug("Debug level log message - from ProductController");
        LOGGER.error("Error level log message - from ProductController");
        
			List<Product> products =  productService.findAllProducts();
			return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	/*
	 * This method is used for to get all the product details based on the input productName variable as response
	 * @input productName
	 * @return List of Products
	 */
	
	@GetMapping("/{productName}")
	public ResponseEntity<List<Product>> getProductsByProductName(@PathVariable String productName){
			List<Product> products =  productService.findProductsByProductName(productName);
			return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	/*
	 * This below - createProduct - method is used to save the entire Product object into respective Data base
	 * @input Product
	 * @return String
	 */
	
	@PostMapping("")
	public ResponseEntity<String> createProduct(@RequestBody Product product){
		String response =  productService.saveProduct(product);
			return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

}
