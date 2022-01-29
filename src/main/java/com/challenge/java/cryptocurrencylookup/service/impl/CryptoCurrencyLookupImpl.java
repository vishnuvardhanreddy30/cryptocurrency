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

	private boolean flag;

	@Override
	public ModelAndView currencyLookup(HttpServletRequest request, String ipAddress) {

		String clientIp;
		if (ipAddress.isEmpty()) {
			flag = true;
			clientIp = requestService.getClientIp(request);
		} else {
			flag = false;
			clientIp = ipAddress;
		}

		ModelAndView modelAndView = new ModelAndView("currencylookup.jsp");

		modelAndView.addObject("unitPrice", mapCurrency(clientIp));
		return modelAndView;
	}

	private String mapCurrency(String clientIP) {

		if (flag) {

			// clientip address fetched from httpRequest
			return "6.66";
		} else

			// clientip address provided by user
			return "7.66";
	}
}
