package hcl.com.ing.shopping.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hcl.com.ing.shopping.cart.constants.ShoppingCartConstants;
import hcl.com.ing.shopping.cart.entity.Product;
import hcl.com.ing.shopping.cart.entity.ProductSeller;
import hcl.com.ing.shopping.cart.entity.UserOrder;
import hcl.com.ing.shopping.cart.repository.ProductRepository;
import hcl.com.ing.shopping.cart.repository.UserOrderRepository;

/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this UserAddressService - is used to do the business logic implementations for UserOrders
 */

@Service
public class UserOrderService {
	
	/*
	 *  Creating the UserOrderRepository object to call respective repository
	 */
	
	@Autowired
	private UserOrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	/*
	 *  Creating the ProductRepository object to call respective repository
	 */
	
	public String orderPoduct(UserOrder userOrder) {
		
		List<Product> products = productRepository.findByProductNameContains(userOrder.getProductName());
		
		if(!products.isEmpty()) {
			
			Product product =products.get(0);
			ProductSeller productSeller = products.get(0).getProductSeller().get(0);
			
			UserOrder userOrders = new UserOrder();
			
			userOrders.setUserId(product.getUserId());
			userOrders.setProductName(product.getProductName());
			userOrders.setProductId(product.getProductId());
			userOrders.setPrice(product.getPrice());
			userOrders.setSellerId(productSeller.getSellerId());
			userOrders.setSellerName(productSeller.getSeller());
			
			orderRepository.save(userOrders);
			
			return ShoppingCartConstants.getOprationSuccess();
		}
		return null;
	}
}
