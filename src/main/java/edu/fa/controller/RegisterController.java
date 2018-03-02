package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.fa.model.Fresher;
import edu.fa.service.RegisterService;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("register")
	public String showRegister(Model model) {
		model.addAttribute("fresher",new Fresher());
		return "register";
	}
	
	@RequestMapping("userRegister")
	public String showRegister(@ModelAttribute("fresher") Fresher fresher,Model model) {
		if (registerService.register(fresher)) {
		model.addAttribute("fresher",new Fresher());
		return "redirect:login";
		} else {
			model.addAttribute("error", true);
			return "redirect:register";
		}
		
	}
}