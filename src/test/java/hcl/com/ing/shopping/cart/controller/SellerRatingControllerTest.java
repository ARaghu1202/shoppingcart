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

import hcl.com.ing.shopping.cart.service.SellerRatingService;

@RunWith(SpringRunner.class)
@WebMvcTest(SellerRatingController.class)
public class SellerRatingControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
	private SellerRatingService sellerRatingService;

    @Test
    public void getAllSellerRatings() throws Exception 
    {
    	mockMvc.perform( MockMvcRequestBuilders
          .get("/sellerratings")
          .accept(MediaType.APPLICATION_JSON))
          .andDo(print())
          .andExpect(status().isOk());
    }
     
    @Test
    public void getSellerRatingByProductName() throws Exception 
    {
    	mockMvc.perform( MockMvcRequestBuilders
          .get("/sellerratings/ratings/{productName}", "iPhone6")
          .accept(MediaType.APPLICATION_JSON))
          .andDo(print())
          .andExpect(status().isOk());
    }


}
