package com.challenge.java.ip.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

@Component
public interface RequestService {

	String getClientIp(HttpServletRequest request);
}
