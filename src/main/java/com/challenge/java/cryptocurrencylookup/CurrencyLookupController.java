package com.challenge.java.cryptocurrencylookup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CurrencyLookupController {
	
	@RequestMapping("home")
	public String CurrencyLookup() {
		
		System.out.println("I am in controller");
		return "currencylookup.jsp";
	}

}
