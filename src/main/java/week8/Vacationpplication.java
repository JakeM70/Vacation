package week8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import week8.beans.Destination;

import week8.controller.BeanConfiguration;
import week8.repository.ContactRepository;

@SpringBootApplication
public class Vacationpplication {

	public static void main(String[] args) {
		SpringApplication.run(Vacationpplication.class, args);
	}
	/*@Autowired
	ContactRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Destination d = appContext.getBean("destination",Destination.class);
		d.setRatingOutOf5(5);
		repo.save(d);
		Destination d2 = new Destination("London", "Paris", 5);
		
		repo.save(d2);
		
		List<Destination> allMyDestinations = repo.findAll();
		for(Destination spots: allMyDestinations) {
		System.out.println(spots.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}*/

}
