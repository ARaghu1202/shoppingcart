package hcl.com.ing.shopping.cart.dto;

/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 */

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
public class ProductSellerRatingDto implements Serializable {
	
	private static final long serialVersionUID = 9054840757103635030L;
	
	private String productName;
	private String sellerName;
	private Double rating;

}
