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
import com.challenge.java.cryptocurrencylookup.service.impl.RequestServiceImpl;

@SpringBootTest
public class RequestServiceImplTest {
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@Mock
	private HttpServletRequest httpServletRequest;

	@InjectMocks
	private RequestServiceImpl requestServiceImpl;

	@Mock
	private HttpServletRequest httpRequest;

	@Test
	public void fetchCurrencyBasedHTTPRequest() {
		Mockito.when(httpServletRequest.getHeader("X-Forwarded-For")).thenReturn("12.12.12.12");
		String clientIp = requestServiceImpl.getClientIp(httpServletRequest);
		System.out.println("clientIp: " +clientIp);
		Assert.assertEquals("12.12.12.12", clientIp);
	}

}
