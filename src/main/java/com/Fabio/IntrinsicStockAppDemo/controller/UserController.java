package com.Fabio.IntrinsicStockAppDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Fabio.IntrinsicStockAppDemo.domain.Company;
import com.Fabio.IntrinsicStockAppDemo.domain.Portfolio;
import com.Fabio.IntrinsicStockAppDemo.domain.User;
import com.Fabio.IntrinsicStockAppDemo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public String userLogin(ModelMap model) {
		
		model.addAttribute("user", new User());
		
		return "login";
	}
	
	@PostMapping("/login")
	public String userLogin(User user, ModelMap model) {
		int userVerifyCount = 0;
		boolean userVerification = userService.verifyUsernamePassword(user);
		if (userVerification == false && userVerifyCount < 4) {
			return "loginError";
		}
		else if(userVerification == false && userVerifyCount >= 4) {
			return "loginErrorMax";
		}
		else {
			User verifiedUser = userService.getUserByUserName(user.getUserName());
			model.addAttribute("user", verifiedUser);
			model.addAttribute("company", new Company());
			return "redirect:/userWelcome/" + verifiedUser.getUserId();
					}		
	}
	
	@GetMapping("/register")
	public String userRegister(ModelMap model) {
		
		model.addAttribute("user", new User());
		
		return "register";
	}
	
	@PostMapping("/register")
	public String userRegister(User user) {
		
		User userSaved = userService.saveUser(user);
				
		return "redirect:/userWelcome/" + userSaved.getUserId();
	}
	
	@GetMapping("/userWelcome/{userId}")
	public String userWelcome(@PathVariable Long userId, ModelMap model) {
		User verifiedUser = userService.getUserByUseId(userId);
		model.addAttribute("user", verifiedUser);
				
		return "userWelcome";
	}
	
}
