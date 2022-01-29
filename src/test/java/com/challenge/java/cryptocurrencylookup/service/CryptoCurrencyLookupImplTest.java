package com.challenge.java.cryptocurrencylookup.service;

import javax.servlet.http.HttpServletRequest;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.ModelAndView;

import com.challenge.java.cryptocurrencylookup.service.impl.CryptoCurrencyLookupImpl;

@SpringBootTest
public class CryptoCurrencyLookupImplTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@Mock
	private RequestService requestService;

	@InjectMocks
	private CryptoCurrencyLookupImpl cryptoCurrencyLookup;

	@Mock
	private HttpServletRequest httpRequest;

	@Test
	public void fetchCurrencyBasedHTTPRequest() {
		Mockito.when(requestService.getClientIp(httpRequest)).thenReturn("12.12.12.12");
		ModelAndView modelAndView = cryptoCurrencyLookup.currencyLookup(httpRequest, "");
		System.out.println("modelAndView.getModelMap().getAttribute: " +modelAndView.getModelMap().getAttribute("unitPrice"));
		Assert.assertEquals("6.66", modelAndView.getModelMap().getAttribute("unitPrice"));
	}
	
	@Test
	public void fetchCurrencyBasedUserProvided() {
		ModelAndView modelAndView = cryptoCurrencyLookup.currencyLookup(httpRequest, "12.12.12.12");
		System.out.println("modelAndView.getModelMap().getAttribute: " +modelAndView.getModelMap().getAttribute("unitPrice"));
		Assert.assertEquals("7.66", modelAndView.getModelMap().getAttribute("unitPrice"));
	}
}
