package com.challenge.java.cryptocurrencylookup.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

public interface CryptoCurrencyLookup {
	
	ModelAndView currencyLookup(HttpServletRequest request, String ipAddress);

}
