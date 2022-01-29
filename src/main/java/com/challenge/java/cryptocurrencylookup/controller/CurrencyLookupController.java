package com.challenge.java.cryptocurrencylookup.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.challenge.java.cryptocurrencylookup.service.CryptoCurrencyLookup;
import com.challenge.java.cryptocurrencylookup.service.RequestService;

@Controller
public class CurrencyLookupController {
	
	@Autowired
	private CryptoCurrencyLookup CurrencyLookup;
	
	@RequestMapping("/")
	public String CurrencyLookup() {
		
		System.out.println("I am in controller");
		return "home.jsp";
	}
	
	@RequestMapping("/fetchCryptocurrency")
	public ModelAndView CurrencyLookuwp(HttpServletRequest request, @RequestParam String ipAddress) {
		
		System.out.println("I am in fetchCryptocurrency" +ipAddress);
		
		return CurrencyLookup.currencyLookup(request, ipAddress);
	}

}
