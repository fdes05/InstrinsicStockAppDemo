package com.Fabio.IntrinsicStockAppDemo.service;

import java.net.URI;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.Fabio.IntrinsicStockAppDemo.domain.Company;
import com.Fabio.IntrinsicStockAppDemo.dto.AlphavantageApiResult;
import com.Fabio.IntrinsicStockAppDemo.repository.ListOfResultsAV;

@Service
public class AlphaVantageSymbolLookup {
	
	ListOfResultsAV listOfResultsAV = new ListOfResultsAV();
	
	public List<String> searchName(String companyName){
		
		
		RestTemplate rt = new RestTemplate();
		HttpHeaders httpHeader = new HttpHeaders();
				
		httpHeader.setContentType(MediaType.APPLICATION_JSON);
		httpHeader.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
		httpHeader.set("x-rapidapi-host", "alpha-vantage.p.rapidapi.com");
		httpHeader.set("x-rapidapi-key", "ad262f2525mshb62b76f056eb70ep185f91jsn5e3c42d43e86");
		
		HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeader);
				
		URI uri = UriComponentsBuilder.fromHttpUrl("https://alpha-vantage.p.rapidapi.com/query")
				  .queryParam("function", "SYMBOL_SEARCH")
				  .queryParam("keywords", companyName)
				  .build()
				  .toUri();
		ResponseEntity<AlphavantageApiResult> response = rt.exchange(
				uri, 
				HttpMethod.GET,
				requestEntity, 
				AlphavantageApiResult.class
				);
		System.out.println(response.getBody());
		List<String> listOfSymbols = getListOfResultsAV(response);
		return listOfSymbols;
	}
	private List<String> getListOfResultsAV(ResponseEntity<AlphavantageApiResult> response) {
		
		List<String> listOfSymbols = listOfResultsAV.saveListOfResultsAV(response);
		return listOfSymbols;
	}

}
