package hcl.com.ing.shopping.cart.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import hcl.com.ing.shopping.cart.service.ProductSellerService;


@RunWith(SpringRunner.class)
@WebMvcTest(ProductSellerController.class)
public class ProductSellerControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
	private ProductSellerService productSellerService;

    @Test
    public void getAllSellers() throws Exception 
    {
    	mockMvc.perform( MockMvcRequestBuilders
          .get("/productsellers")
          .accept(MediaType.APPLICATION_JSON))
          .andDo(print())
          .andExpect(status().isOk());
    }
     
    @Test
    public void getSellerById() throws Exception 
    {
    	mockMvc.perform( MockMvcRequestBuilders
          .get("/productsellers/{sellerId}", 2)
          .accept(MediaType.APPLICATION_JSON))
          .andDo(print())
          .andExpect(status().isOk());
    }

}
