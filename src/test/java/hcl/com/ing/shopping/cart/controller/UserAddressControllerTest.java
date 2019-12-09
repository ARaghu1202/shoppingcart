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

import hcl.com.ing.shopping.cart.service.UserAddressService;
@RunWith(SpringRunner.class)
@WebMvcTest(UserAddressController.class)
public class UserAddressControllerTest {

	@Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserAddressService userAddressService;

    @Test
    public void getAllProducts() throws Exception 
    {
    	mockMvc.perform( MockMvcRequestBuilders
          .get("/userscontacts")
          .accept(MediaType.APPLICATION_JSON))
          .andDo(print())
          .andExpect(status().isOk());
    }
}
