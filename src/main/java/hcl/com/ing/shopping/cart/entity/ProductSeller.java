package hcl.com.ing.shopping.cart.entity;

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

/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 */


@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
@Entity
@Table(name ="product_seller")
public class ProductSeller  implements Serializable{
	
	private static final long serialVersionUID = -5586097324525094073L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sellerId;
	@Column(name = "product_name")
	private String productName;	
	private String seller;
	private String location;
}
