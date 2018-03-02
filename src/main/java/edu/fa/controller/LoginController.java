package edu.fa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.fa.model.Fresher;
import edu.fa.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "login")
	public String showLogin(Model model) {
		model.addAttribute("fresher", new Fresher()); // fresher trùng với modelAttribute bên view
		return "login";
	}

	@RequestMapping(value = "dashboard")
	public String login(@ModelAttribute("fresher") Fresher fresher, Model model) { // @ModelAttribute là cái load từ
																					// login lên.
		if (loginService.login(fresher)) {
			model.addAttribute("fresher", fresher);
			return "dashboard";
		} else {
			model.addAttribute("error", true);
			return "redirect:login";
		}
	}
}
