package com.Fabio.IntrinsicStockAppDemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BestMatches {
	
	@JsonProperty("1. symbol")
	private String symbol;
	@JsonProperty("2. name")
	private String name;
	@JsonProperty("3. type")
	private String type;
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}	

}
