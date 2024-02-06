package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.dao.PersonDao;
import com.mvc.entity.Person;
import com.mvc.services.PersonService;
//Starting of login page
@Controller
public class ControllerFace {
	@RequestMapping("/register")
public String register()
{
	return "rpage";
}
	//Logic to save data to database
	@RequestMapping(path = "/savedata",method = RequestMethod.POST)
public String saveData(@ModelAttribute Person person ,Model model)
{
	PersonService personService =new PersonService();
	personService.saveService(person);
	return "fbrgsuccess";
}
	
}
