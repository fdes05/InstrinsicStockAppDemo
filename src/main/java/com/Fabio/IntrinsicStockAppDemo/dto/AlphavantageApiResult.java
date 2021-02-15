package com.Fabio.IntrinsicStockAppDemo.dto;

import java.util.List;

public class AlphavantageApiResult {
	
	private List<BestMatches> bestMatches;

	public List<BestMatches> getBestMatches() {
		return bestMatches;
	}

	public void setBestMatches(List<BestMatches> bestMatches) {
		this.bestMatches = bestMatches;
	}
	
	

}
