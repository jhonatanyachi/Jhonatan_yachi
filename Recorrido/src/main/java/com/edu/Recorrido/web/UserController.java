package com.edu.Recorrido.web;

//import java.util.List;
//import java.util.Map;

import javax.validation.Valid;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.edu.Recorrido.model.User;
//import com.edu.Recorrido.repository.UserRepository;

@Controller
public class UserController {
	
	//@Autowired
	//private UserRepository userRepository;

	@GetMapping("/new")
	public String initCreationForm(Model model) {
		model.addAttribute("user", new User());
		return "userForm";
	}
	
	@PostMapping("/new")
	public String submitForm(@ModelAttribute User user) {
		Double galon;

		//userRepository.save(user);
		switch(user.getMarca()) {
		case "A":
			galon = user.getRecorrido()/40.0;
			user.setGalon(galon);
			break;
		case "B":
			galon = user.getRecorrido()/35.0;
			user.setGalon(galon);
			break;
		case "C":
			galon = user.getRecorrido()/45.0;
			user.setGalon(galon);
			break;
		}
		return "resultForm";
	}
	
	//@GetMapping("/list")
	//public String list(Map<String,Object> model) {
		//List<User> users = userRepository.findAll(); 
		//model.put("users",users);
		//return "listUser";
	//}
}
