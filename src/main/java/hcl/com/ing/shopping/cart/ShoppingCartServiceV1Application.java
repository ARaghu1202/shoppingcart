package hcl.com.ing.shopping.cart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @author  AKUTHOTA.RAGHU 
 * @version 1.0
 * @since   2019-11-24 
 * Here, this ShoppingCartServiceV1Application - to start this - spring boot ShoppingCartServiceV1Application service
 */

@SpringBootApplication
public class ShoppingCartServiceV1Application {
	
	private static final Logger LOGGER = LogManager.getLogger(ShoppingCartServiceV1Application.class);

	public static void main(String[] args) {
		
		SpringApplication.run(ShoppingCartServiceV1Application.class, args);
		LOGGER.info("Info level log message");
		LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");
		
	}
}
