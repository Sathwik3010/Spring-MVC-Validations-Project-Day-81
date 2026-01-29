package com.codegnan.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codegnan.model.User;

@Controller
public class RegisterController {
	@RequestMapping(value="/registeruser")
	public String registerUser(@Valid @ModelAttribute User user, 
			BindingResult result, Model model) {
		
		// check if there are validation errors
		if(result.hasErrors()) {
			// create a map to store error messages
			Map<String, String> errors = new HashMap<>();
			
			// Iterate through all errors and add them to the map
			for(FieldError error:result.getFieldErrors()) {
				errors.put(error.getField(), error.getDefaultMessage());
			}
			
			// Add the errors map to the model and return to the error page
				model.addAttribute("errors",errors);
				return "errorpage"; // Show error page
			
		} else {
			// If no validation errors, add user to the model and show user details
			model.addAttribute("user",user);
			return "user";
		}
	}
}
