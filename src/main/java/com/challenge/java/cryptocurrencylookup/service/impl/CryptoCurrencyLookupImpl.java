package com.challenge.java.cryptocurrencylookup.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.challenge.java.cryptocurrencylookup.service.CryptoCurrencyLookup;
import com.challenge.java.cryptocurrencylookup.service.RequestService;

@Service
public class CryptoCurrencyLookupImpl implements CryptoCurrencyLookup {

	@Autowired
	private RequestService requestService;

	@Override
	public ModelAndView currencyLookup(HttpServletRequest request, String ipAddress) {
		String clientIp;
		if (ipAddress.isEmpty()) {
			clientIp = requestService.getClientIp(request);
		} else {
			clientIp = ipAddress;
		}

		ModelAndView modelAndView = new ModelAndView("currencylookup.jsp");

		System.out.println("clientIp: " + mapCurrency(clientIp));
		
		modelAndView.addObject("unitPrice", mapCurrency(clientIp));
		return modelAndView;
	}
	
	private String mapCurrency(String clientIP) {
		String symbol = "U+20AC";
		return "6.66";
		
	}
}
