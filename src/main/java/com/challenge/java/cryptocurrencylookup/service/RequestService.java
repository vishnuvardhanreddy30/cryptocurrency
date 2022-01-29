package com.challenge.java.cryptocurrencylookup.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;


public interface RequestService {

	String getClientIp(HttpServletRequest request);
}
