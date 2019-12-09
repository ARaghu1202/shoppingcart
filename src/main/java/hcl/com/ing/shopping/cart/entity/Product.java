package hcl.com.ing.shopping.cart.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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

@Entity
@Setter@Getter
@AllArgsConstructor@NoArgsConstructor
@ToString
@Table(name ="product")
public class Product implements Serializable{

	private static final long serialVersionUID = 1766449539555828860L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	@Column(name ="product_name")
	private String productName;
	private Integer userId;
	private Double price;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="product_name", referencedColumnName = "product_name")
	private List<ProductSeller> productSeller;
	
}
