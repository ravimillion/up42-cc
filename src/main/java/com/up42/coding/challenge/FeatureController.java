package com.up42.coding.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.up42.coding.challenge.data.FeatureDAO;

@RestController
public class FeatureController {
	@Autowired
	private FeatureDAO featureDAO;

	@GetMapping(path = "/features", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String getFeatures() {
		featureDAO.loadJSONData();
		featureDAO.getAllFeatures();
		return "Data Loading is working";
	}
}
