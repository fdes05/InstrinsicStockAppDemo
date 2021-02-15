package com.Fabio.IntrinsicStockAppDemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlphaVantageCompanyDetails {

	@JsonProperty("financialData")
	private FinancialData financialData;
	@JsonProperty("summaryDetail")
	private SummaryDetail summaryDetail;
	
	public FinancialData getFinancialData() {
		return financialData;
	}
	public void setFinancialData(FinancialData financialData) {
		this.financialData = financialData;
	}
	public SummaryDetail getSummaryDetail() {
		return summaryDetail;
	}
	public void setSummaryDetail(SummaryDetail summaryDetail) {
		this.summaryDetail = summaryDetail;
	}
	
	
	
}
