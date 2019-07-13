package com.up42.coding.challenge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.up42.coding.challenge.interfaces.IFeatureDef;
import com.up42.coding.challenge.service.FeatureDef;
import com.up42.coding.challenge.service.FeatureService;

@RestController
public class FeatureController {
	@Autowired
	private FeatureService featureService;

	@GetMapping(path = "/features", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<IFeatureDef> getFeatures() {
		return featureService.getFeatures();
	}

	@GetMapping(path = "/features/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public FeatureDef getFeature(@PathVariable String id) {
		return featureService.getFeature(id);
	}
}
