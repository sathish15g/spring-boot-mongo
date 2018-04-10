package com.sathish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.model.CableInternetCatalog;
import com.sathish.repo.CableInternetCatalogRepo;

@Service
public class CableInternetCatalogService {

	@Autowired
	private CableInternetCatalogRepo cableInternetCatalogRepo;

	public CableInternetCatalog retrieveCatalog(String planName) {
		return cableInternetCatalogRepo.findByPlanName(planName);
	}

	public CableInternetCatalog postCatalog(CableInternetCatalog cableInternetCatalog) {
		return cableInternetCatalogRepo.save(cableInternetCatalog);
	}

}
