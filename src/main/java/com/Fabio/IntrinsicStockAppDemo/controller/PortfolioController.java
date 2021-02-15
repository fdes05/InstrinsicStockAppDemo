package com.Fabio.IntrinsicStockAppDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Fabio.IntrinsicStockAppDemo.domain.Portfolio;

@Controller
public class PortfolioController {

	@GetMapping("/portfolio/{UserId}")
	public String getUserPortfolio(@PathVariable String userId, ModelMap model) {
		model.addAttribute("userId", userId);
		model.addAttribute("portfolio", new Portfolio());
		
		return "portfolioView";
	}
}
