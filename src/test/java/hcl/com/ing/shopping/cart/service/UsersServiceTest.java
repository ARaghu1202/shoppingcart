package hcl.com.ing.shopping.cart.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import hcl.com.ing.shopping.cart.entity.User;
import hcl.com.ing.shopping.cart.repository.UserRepository;

@RunWith(MockitoJUnitRunner.Silent.class)
public class UsersServiceTest {
	
	@InjectMocks
	UserService userService;
	
	@Mock
	UserRepository userRepository;
	
	static User user = new User();
	static List<User> users = new ArrayList<User>();
	
	@BeforeClass
	public static void setup(){
		user.setId(1);
		user.setName("Raghu");
		users.add(user);
	}
	
	@Test
	public void testFindByIdForPositive(){
		Mockito.when(userRepository.findById(1)).thenReturn(Optional.of(user));
		Optional<User> user = userRepository.findById(1);
		Assert.assertNotNull(user);
		Assert.assertEquals("Raghu", user.get().getName());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testFindByIdForNegative(){
		Mockito.when(userRepository.findById(2)).thenReturn(Optional.of(user));
		Optional<User> user = userService.findUserById(1);
		Assert.assertNotNull(user.empty());
	}

	@Test
	public void testGetAllUsers(){
		Mockito.when(userRepository.findAll()).thenReturn(users);
		
		  List<User> users = userRepository.findAll();
		  Assert.assertNotNull(users); Assert.assertEquals(1, users.size());
	}
}
