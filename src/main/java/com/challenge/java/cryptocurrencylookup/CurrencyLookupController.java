package com.challenge.java.cryptocurrencylookup;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.challenge.java.ip.service.RequestService;

@Controller
public class CurrencyLookupController {
	
	@Autowired(required=true)
	private RequestService requestService;
	
	@RequestMapping("/")
	public String CurrencyLookup(HttpServletRequest request) {
		
		System.out.println("I am in controller");
		
		ModelAndView modelAndView = new ModelAndView("currencylookup.jsp");
		String clientIp = requestService.getClientIp(request);
		modelAndView.addObject("clientIp", clientIp);
		return "currencylookup.jsp";
	}
	
	@RequestMapping("/fetchCryptocurrency")
	public ModelAndView CurrencyLookuwp(HttpServletRequest request, @RequestParam String ipAddress) {
		
		System.out.println("I am in fetchCryptocurrency" +ipAddress);
		
		ModelAndView modelAndView = new ModelAndView("currencylookup.jsp");
		String clientIp = requestService.getClientIp(request);
		System.out.println("clientIp: "+clientIp);
		modelAndView.addObject("clientIp", clientIp);
		return modelAndView;
	}

}
