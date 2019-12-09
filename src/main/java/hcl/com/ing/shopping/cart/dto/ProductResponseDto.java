package hcl.com.ing.shopping.cart.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-26
 */

@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
public class ProductResponseDto {

	private String message;
	private Integer statusCode;
	private List<ProductRequestDto> products;
}
