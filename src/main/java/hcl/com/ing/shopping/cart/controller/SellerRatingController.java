package hcl.com.ing.shopping.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hcl.com.ing.shopping.cart.dto.ProductSellerRatingDto;
import hcl.com.ing.shopping.cart.entity.SellerRating;
import hcl.com.ing.shopping.cart.service.SellerRatingService;

/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this SellerRatingController - is used to do the all the REST API calls on - Products 
 */

@RestController
@RequestMapping("/sellerratings")
public class SellerRatingController {

	/*
	 *  Creating the SellerRatingService object to call respective service
	 */
	
	@Autowired
	private SellerRatingService sellerRatingService;
	
	/*
	 * This method is used for to get all the SellerRatings and provide as List of SellerRating as response
	 * @return List of SellerRating
	 */
	
	@GetMapping("")
	public ResponseEntity<List<SellerRating>> getAllSellerRatings(){
			List<SellerRating> sellerRatings =  sellerRatingService.findAllSellerRatings();
			return new ResponseEntity<>(sellerRatings, HttpStatus.OK);
	}
	
	/*
	 * This method is used for to get all the SellerRating details based on the input or request SellerRating variable as response
	 * @input SellerRating
	 * @return List of SellerRating
	 */
	
	@GetMapping("/ratings/{productName}")
	public ResponseEntity<List<ProductSellerRatingDto>> getRatingsByProductNameAndSellerName(@PathVariable String productName){
			List<ProductSellerRatingDto> sellerRatings =  sellerRatingService.findSellerRatingByProductName(productName);
			return new ResponseEntity<>(sellerRatings, HttpStatus.OK);
	}
	
	/*
	 * This below - createProduct - method is used to save the entire SellerRating object into respective Data base
	 * @input SellerRating
	 * @return String
	 */
	
	@PostMapping("")
	public ResponseEntity<String> createSellerRating(@RequestBody SellerRating sellerRating){
			String sellerRatingResponse =  sellerRatingService.saveSellerRating(sellerRating);
			return new ResponseEntity<>(sellerRatingResponse, HttpStatus.OK);
	}

}
