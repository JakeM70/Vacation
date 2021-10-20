package week8.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import week8.beans.Destination;


/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Destination destination() {
	Destination bean = new Destination( );
	bean.setCountry("US");
	bean.setDesinationName("Las Vegas");
	bean.setRatingOutOf5(4);
	return bean;
	}
	
	
}
