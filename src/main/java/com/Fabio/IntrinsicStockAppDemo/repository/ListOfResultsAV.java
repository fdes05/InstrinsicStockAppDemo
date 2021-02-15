package com.Fabio.IntrinsicStockAppDemo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.Fabio.IntrinsicStockAppDemo.dto.AlphavantageApiResult;

public class ListOfResultsAV {

	List<String> resultListAV = new ArrayList<>();
	
	public List<String> saveListOfResultsAV(ResponseEntity<AlphavantageApiResult> response) {
		
		resultListAV.clear();
		
		for (int i = 0; i < response.getBody().getBestMatches().size(); i++) {
			String symbol = response.getBody().getBestMatches().get(i).getSymbol();
			resultListAV.add(symbol);
		}
		
		System.out.println(resultListAV.stream().count());
		return resultListAV;
	}
}
