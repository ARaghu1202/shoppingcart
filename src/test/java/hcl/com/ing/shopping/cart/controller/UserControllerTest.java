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

import hcl.com.ing.shopping.cart.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

	@Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void getAllUsers() throws Exception 
    {
    	mockMvc.perform( MockMvcRequestBuilders
          .get("/users")
          .accept(MediaType.APPLICATION_JSON))
          .andDo(print())
          .andExpect(status().isOk());
    }
     
    @Test
    public void getUserById() throws Exception 
    {
    	mockMvc.perform( MockMvcRequestBuilders
          .get("/users/{id}", 2)
          .accept(MediaType.APPLICATION_JSON))
          .andDo(print())
          .andExpect(status().isOk());
    }
	
}
