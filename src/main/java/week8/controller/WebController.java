package week8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import week8.beans.Destination;
import week8.repository.ContactRepository;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Nov 3, 2021
 */
@Controller
public class WebController {
	@Autowired
	ContactRepository repo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllDestinations(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewDestination(model);
		}
	model.addAttribute("destinations", repo.findAll());
	return "results";
}
	@GetMapping("/inputDestination")
	public
	String addNewDestination(Model model) {
	Destination d = new Destination();
	model.addAttribute("newDestination", d);
	return"input";
	}
	
	@PostMapping("/inputDestination")
	public String addNewContact(@ModelAttribute Destination d,Model model) {
	repo.save(d);
	return viewAllDestinations(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateContact(@PathVariable("id") long id,Model model) {
	Destination d = repo.findById(id).orElse(null);
	model.addAttribute("newDestination", d);
	return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseDestination(Destination d, Model model) {
	repo.save(d);
	return viewAllDestinations(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteDestination(@PathVariable("id") long id, Model model) {
	Destination d = repo.findById(id).orElse(null);
	repo.delete(d);
	return viewAllDestinations(model);
}
}