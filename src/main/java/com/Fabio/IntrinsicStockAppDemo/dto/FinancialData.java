package com.Fabio.IntrinsicStockAppDemo.dto;

public class FinancialData {

	private Ebitda ebitda;
	private FreeCashflow freeCashflow;
	private CurrentRatio currentRatio;
	private TotalDebt totalDebt;
	private TotalRevenue totalRevenue;
	
	public Ebitda getEbitda() {
		return ebitda;
	}
	public void setEbitda(Ebitda ebitda) {
		this.ebitda = ebitda;
	}
	public FreeCashflow getFreeCashflow() {
		return freeCashflow;
	}
	public void setFreeCashflow(FreeCashflow freeCashflow) {
		this.freeCashflow = freeCashflow;
	}
	public CurrentRatio getCurrentRatio() {
		return currentRatio;
	}
	public void setCurrentRatio(CurrentRatio currentRatio) {
		this.currentRatio = currentRatio;
	}
	public TotalDebt getTotalDebt() {
		return totalDebt;
	}
	public void setTotalDebt(TotalDebt totalDebt) {
		this.totalDebt = totalDebt;
	}
	public TotalRevenue getTotalRevenue() {
		return totalRevenue;
	}
	public void setTotalRevenue(TotalRevenue totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
	
	
	
	
	
}
