package com.fnb.bank.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fnb.bank.entity.BankServices;
import com.fnb.bank.repository.BankServiceRepo;

@RestController
@RequestMapping("/fnb-bank")
public class BankServiceController {
	
	@Autowired
	private BankServiceRepo bankServiceRepo;
	
	
	@GetMapping(value="/fetchServices")
	public ResponseEntity<List<String>> getServices(){
		
		ResponseEntity<List<String>> responseBody = null;
		List<BankServices> bankServiceList =	bankServiceRepo.findAll();
		if(bankServiceList != null && !bankServiceList.isEmpty()) {
			List<String> serviceNames = new ArrayList<String>();
			for(int i=0; i<bankServiceList.size() ; i++) {
				serviceNames.add(bankServiceList.get(i).getServiceName());
			}
			
			responseBody = new ResponseEntity<List<String>>(serviceNames,HttpStatus.OK);
			return responseBody;
		} else if(bankServiceList == null && bankServiceList.isEmpty()){
						
			responseBody = new ResponseEntity<List<String>>(Arrays.asList("No data found"),HttpStatus.BAD_REQUEST);
	
			return responseBody;
		}
		return null;
	}
	

}
