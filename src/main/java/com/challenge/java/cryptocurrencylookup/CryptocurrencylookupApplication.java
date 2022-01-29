package com.challenge.java.cryptocurrencylookup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.*"})
public class CryptocurrencylookupApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptocurrencylookupApplication.class, args);
	}

}
