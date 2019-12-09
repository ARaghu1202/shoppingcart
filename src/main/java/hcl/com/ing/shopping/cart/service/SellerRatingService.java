package hcl.com.ing.shopping.cart.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hcl.com.ing.shopping.cart.constants.ShoppingCartConstants;
import hcl.com.ing.shopping.cart.dto.ProductSellerRatingDto;
import hcl.com.ing.shopping.cart.entity.SellerRating;
import hcl.com.ing.shopping.cart.repository.SellerRatingRepository;
/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this SellerRatingService - is used to do the business logic implementations for SellerRatings
 */
@Service
public class SellerRatingService {

   /*
	*  Creating the SellerRatingRepository object to call respective repository
	*/
	@Autowired
	private SellerRatingRepository sellerRatingRepository;

   /*
	* This service method is use for save the SellerRating Object
	*/
	public String saveSellerRating(SellerRating sellerRating) {
			sellerRatingRepository.save(sellerRating);
			return ShoppingCartConstants.getOprationSuccess();
	}

	/*
	 * This service method is use for fetch the fetch all SellerRating Objects
	 */
	public List<SellerRating> findAllSellerRatings() {
			return sellerRatingRepository.findAll();
	}

   /*
	* This service method is use for fetch the SellerRating Object based on the input productName 
	* and returns single List SellerRating record 
	*/
	public List<ProductSellerRatingDto> findSellerRatingByProductName(String productName) {
		
			List<ProductSellerRatingDto> productSellerRating = new ArrayList<>();
			
			List<SellerRating> sellerRatings = sellerRatingRepository.findByProductName(productName);
			
			Map<Object, Double> sellerRatingsGroup  =   sellerRatings.stream()
		        .collect(Collectors.groupingBy(sellerRating -> sellerRating.getSellerName(), Collectors.averagingDouble(sellerRating->sellerRating.getRating())));
			
			for (Entry<Object, Double> entry : sellerRatingsGroup.entrySet()) {
				String sellerName = (String) entry.getKey();
				productSellerRating.add(new ProductSellerRatingDto(sellerRatings.get(0).getProductName(), sellerName, entry.getValue()));
			}
			
			return productSellerRating;
	}
}
