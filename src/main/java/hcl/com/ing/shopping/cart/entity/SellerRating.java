package hcl.com.ing.shopping.cart.entity;


/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 */

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
@Entity
@Table(name ="seller_rating")
public class SellerRating implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Integer id;
	
	@Column(name ="product_name")
	private String productName;	
	
	@Column(name ="seller")
	private String sellerName;
	
	@Column(name ="rating")
	private Double rating;
	
}
