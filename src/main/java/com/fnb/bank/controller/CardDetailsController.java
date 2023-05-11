package com.fnb.bank.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fnb.bank.model.CardDetailsModel;
import com.fnb.bank.service.CardDetailsService;

@RestController
@RequestMapping(value="/admin")
public class CardDetailsController {

	@Autowired
	CardDetailsService cardDetailsService;
	
	Logger logger = LoggerFactory.getLogger(CardDetailsController.class);
	
	@PostMapping(value="/store/card-details")
	public ResponseEntity<String> storeCardDetails(@RequestBody CardDetailsModel cardDetailsModel){
		
		logger.info("Request recieved by the value" +cardDetailsModel);
		
		Boolean inputCardDetails = cardDetailsService.insertCardDetails(cardDetailsModel);
				
		if(inputCardDetails) {
			logger.info("Successfully Store the Card Details");
			return new ResponseEntity<String>("Card Details Stored Successfully", HttpStatus.OK);
		}else {
			logger.info("Got an error while storing the details");
			return new ResponseEntity<String>("Got an error while storing the details", HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping(value="/retrieve/card-details",  produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CardDetailsModel>> retrieveCardDetails(){
		
		 List<CardDetailsModel> outputCardDetails = cardDetailsService.retrieveCardDetails();
		if(outputCardDetails != null && !outputCardDetails.isEmpty()) {
			logger.info("Successfully Store the Card Details");
			return new ResponseEntity<List<CardDetailsModel>>(outputCardDetails, HttpStatus.OK);
		}else {
			logger.info("Got an error while storing the details");
			return new ResponseEntity<List<CardDetailsModel>>(outputCardDetails, HttpStatus.BAD_REQUEST);
		}
	}
}
