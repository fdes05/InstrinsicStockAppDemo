package com.Fabio.IntrinsicStockAppDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Fabio.IntrinsicStockAppDemo.domain.Company;
import com.Fabio.IntrinsicStockAppDemo.dto.AlphaVantageCompanyDetails;
import com.Fabio.IntrinsicStockAppDemo.service.AlphaVantageCompanyDetailsService;
import com.Fabio.IntrinsicStockAppDemo.service.AlphaVantageSymbolLookup;


@Controller
public class HomeController {

	@Autowired
	AlphaVantageSymbolLookup AVSymbolLookup;
	
	@Autowired
	AlphaVantageCompanyDetailsService AVCompanyDetails;
	
	@GetMapping("")
	public String getHomePage(ModelMap model) {
		
		model.addAttribute("company", new Company());
				
		return "index.html";
	}
	
	@PostMapping("/companysearch")
	public String getCompanySearch(Company company, ModelMap model) {
		System.out.println(company.getName());
		List<String> companyList = AVSymbolLookup.searchName(company.getName());
		
		model.addAttribute("companyList", companyList);
		
		return "companySearchResults.html";
	}
	
	@GetMapping("/companyinfo/{symbol}")
	public String getCompanyInfo(@PathVariable String symbol, ModelMap model) {
		System.out.println(symbol);
		
		AlphaVantageCompanyDetails compDetails = AVCompanyDetails.searchCompanyDetails(symbol);
	//	format(response.getBody().getFinancialData().getEbitda());
		model.addAttribute("companyDetails", compDetails);
		model.addAttribute("symbol", symbol);
		
		return "companyDetails";
	}
	
	
}
