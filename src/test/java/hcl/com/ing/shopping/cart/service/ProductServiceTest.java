package hcl.com.ing.shopping.cart.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import hcl.com.ing.shopping.cart.entity.Product;
import hcl.com.ing.shopping.cart.entity.ProductSeller;
import hcl.com.ing.shopping.cart.repository.ProductRepository;

public class ProductServiceTest {
	
	@InjectMocks
	ProductService productService;
     
    @Mock
    ProductRepository productRepository;
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
     
    @Test
    public void getAllEmployeesTest()
    {
    	
        List<Product> productList = new ArrayList<Product>();
        List<ProductSeller> productSellerList = new  ArrayList<ProductSeller>();
        
        ProductSeller productSellerOne = new ProductSeller();
        
        productSellerOne.setSeller("RelianceDigital");
        productSellerOne.setProductName("Kodak");
        productSellerOne.setLocation("Hyderabad");
        
        ProductSeller productSellerTwo = new ProductSeller();
        
        productSellerTwo.setSeller("RelianceDigital");
        productSellerTwo.setProductName("Nikon");
        productSellerTwo.setLocation("Bangalore");
        
        Product productOne = new Product();
        productOne.setPrice(5600.55);
        productOne.setProductId(1231);
        productOne.setProductName("Kotak");
        productOne.setUserId(12121);
        productOne.setProductSeller(productSellerList);
        
        Product productTwo = new Product();
        productTwo.setPrice(456800.90);
        productTwo.setProductId(4564);
        productTwo.setProductName("Kotak");
        productTwo.setUserId(12131);
        productTwo.setProductSeller(productSellerList);
        
        productList.add(productOne);
        productList.add(productTwo);
        
        when(productRepository.findByProductNameContains("Kotak")).thenReturn(productList);

		List<Product> products = productRepository.findByProductNameContains("Kotak");
		 
		assertEquals(2, productList.size()); verify(productRepository, times(1)).findByProductNameContains("Kotak");
		
    }
}
