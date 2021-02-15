package com.Fabio.IntrinsicStockAppDemo.dto;

public class SummaryDetail {

	private PreviousClose previousClose;
	private TwoHundredDayAverage twoHundredDayAverage;
	private FiftyDayAverage fiftyDayAverage;
	private MarketCap marketCap;
	private FiftyTwoWeekHigh fiftyTwoWeekHigh;
	private FiftyTwoWeekLow	fiftyTwoWeekLow;
	private ForwardPE forwardPE;
	
	public PreviousClose getPreviousClose() {
		return previousClose;
	}
	public void setPreviousClose(PreviousClose previousClose) {
		this.previousClose = previousClose;
	}
	public TwoHundredDayAverage getTwoHundredDayAverage() {
		return twoHundredDayAverage;
	}
	public void setTwoHundredAvg(TwoHundredDayAverage twoHundredDayAverage) {
		this.twoHundredDayAverage = twoHundredDayAverage;
	}
	public FiftyDayAverage getFiftyDayAverage() {
		return fiftyDayAverage;
	}
	public void setFiftyDayAvg(FiftyDayAverage fiftyDayAverage) {
		this.fiftyDayAverage = fiftyDayAverage;
	}
	public MarketCap getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(MarketCap marketCap) {
		this.marketCap = marketCap;
	}
	public FiftyTwoWeekHigh getFiftyTwoWeekHigh() {
		return fiftyTwoWeekHigh;
	}
	public void setFiftyTwoWeekHigh(FiftyTwoWeekHigh fiftyTwoWeekHigh) {
		this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
	}
	public FiftyTwoWeekLow getFiftyTwoWeekLow() {
		return fiftyTwoWeekLow;
	}
	public void setFiftyTwoWeekLow(FiftyTwoWeekLow fiftyTwoWeekLow) {
		this.fiftyTwoWeekLow = fiftyTwoWeekLow;
	}
	public ForwardPE getForwardPE() {
		return forwardPE;
	}
	public void setForwardPE(ForwardPE forwardPE) {
		this.forwardPE = forwardPE;
	}
	
	
}
