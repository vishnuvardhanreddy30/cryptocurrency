package com.challenge.java.cryptocurrencylookup.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.challenge.java.cryptocurrencylookup.service.CryptoCurrencyLookup;

@Controller
public class CurrencyLookupController {
	
	@Autowired
	private CryptoCurrencyLookup currencyLookup;
	
	@GetMapping(value="/")
	public String currencyLookupHome() throws IOException {
		
		return "home.jsp";
	}
	
	@GetMapping(value = "/fetchCryptocurrency")
	public ModelAndView CurrencyLookup(HttpServletRequest request, @RequestParam String ipAddress) throws IOException {
		
		return currencyLookup.currencyLookup(request, ipAddress);
	}

}
