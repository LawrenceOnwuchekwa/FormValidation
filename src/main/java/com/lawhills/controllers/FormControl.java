package com.lawhills.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.lawhills.models.Gender;
import com.lawhills.models.User;
import com.lawhills.models.Wrapper;

import jakarta.validation.Valid;

@Controller
public class FormControl {
//	DEPENDENCY INJECTION
	@Autowired
	Wrapper wrapper;
	String[] countries = Locale.getISOCountries();
	@GetMapping("/submit")
	public String showPage(Model model) {
		model.addAttribute("wrapper", wrapper);
		model.addAttribute("countries", countries);
//		model.addAttribute("gender", Gender.values());
		return "main";
	}
	
	@PostMapping("/processSubmit")
	public String result(@Valid @ModelAttribute Wrapper wrapper,BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			model.addAttribute("countries", countries);
			return "main";
		}
		User users = wrapper.getUsers();
		
		Gender gerund = wrapper.getGerund();
		
		return "result";
		
	}

}
