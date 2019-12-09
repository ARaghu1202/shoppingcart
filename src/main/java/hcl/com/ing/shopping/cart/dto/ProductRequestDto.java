package hcl.com.ing.shopping.cart.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
public class ProductRequestDto implements Serializable {
	
	private static final long serialVersionUID = 1390888641860030734L;
	
	private String productName;
	private Integer userId;
	private Double price;
	private List<ProductSellerRequestDto> productSeller;

}
