package com.challenge.java.cryptocurrencylookup.model;

public class CryptocurrencyModel {
	
	private String ipAddress;
	private String cryptocurrency;
	public String getCryptocurrency() {
		return cryptocurrency;
	}
	public void setCryptocurrency(String cryptocurrency) {
		this.cryptocurrency = cryptocurrency;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	@Override
	public String toString() {
		return "CryptocurrencyModel [cryptocurrency=" + cryptocurrency + ", ipAddress=" + ipAddress + "]";
	}
	
	

}
