package com.Fabio.IntrinsicStockAppDemo.service;

import java.net.URI;
import java.util.Collections;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.Fabio.IntrinsicStockAppDemo.dto.AlphaVantageCompanyDetails;

@Service
public class AlphaVantageCompanyDetailsService {

	public AlphaVantageCompanyDetails searchCompanyDetails(String symbol){
		
		RestTemplate rt = new RestTemplate();
		HttpHeaders httpHeader = new HttpHeaders();
				
		httpHeader.setContentType(MediaType.APPLICATION_JSON);
		httpHeader.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
		httpHeader.set("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com");
		httpHeader.set("x-rapidapi-key", "ad262f2525mshb62b76f056eb70ep185f91jsn5e3c42d43e86");
		
		HttpEntity<Object> requestEntity = new HttpEntity<>(httpHeader);
				
		URI uri = UriComponentsBuilder.fromHttpUrl("https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-summary")
				  .queryParam("region", "US")
				  .queryParam("symbol", symbol)
				  .build()
				  .toUri();
		ResponseEntity<AlphaVantageCompanyDetails> response = rt.exchange(
				uri, 
				HttpMethod.GET,
				requestEntity, 
				AlphaVantageCompanyDetails.class
				);
		AlphaVantageCompanyDetails compDetails = response.getBody();
						
		return compDetails;
	}
}
