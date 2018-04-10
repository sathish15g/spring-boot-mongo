package com.sathish.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sathish.model.CableInternetCatalog;
import com.sathish.service.CableInternetCatalogService;

@RestController
public class CableInternetCatalogController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private CableInternetCatalogService catalogService;

	@GetMapping("/catalog-service/{planName}")
	public ResponseEntity<Object> retrieveCatalog(@PathVariable String planName) {
		CableInternetCatalog response = catalogService.retrieveCatalog(planName);
		logger.info("retrive plan from catalog service {}", response);
		if(response==null) {
			return new ResponseEntity<>("Plan not found", HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<>(response, HttpStatus.OK);
		}

	}

	@PostMapping("/catalog-service")
	public CableInternetCatalog postCatalog(@RequestBody CableInternetCatalog cableInternetCatalog) {
		logger.info("posting from catalog-service {}", cableInternetCatalog);
		return catalogService.postCatalog(cableInternetCatalog);
	}



}
