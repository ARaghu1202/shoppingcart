package hcl.com.ing.shopping.cart.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 */


@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
public class ProductSellerRequestDto implements Serializable {
	
	private static final long serialVersionUID = 5111607861946880988L;
	
	private String productName;	
	private String seller;
	private String location;

}
