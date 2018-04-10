package com.sathish.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.sathish.model.CableInternetCatalog;

public interface CableInternetCatalogRepo extends MongoRepository<CableInternetCatalog,String>{

	CableInternetCatalog findByPlanName(String planName);

}
