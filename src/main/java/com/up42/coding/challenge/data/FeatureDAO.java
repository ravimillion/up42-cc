package com.up42.coding.challenge.data;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.up42.coding.challenge.interfaces.IFeature;
import com.up42.coding.challenge.interfaces.IFeatureCollection;
import com.up42.coding.challenge.interfaces.IFeatureDAO;

@Component
public class FeatureDAO implements IFeatureDAO {
	
	private List<FeatureCollection> featureCollection;
	private String JSON_DATA_FILE = "/static/source-data.json";

	public void loadJSONData() {		
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<FeatureCollection>> typeReference = new TypeReference<List<FeatureCollection>>() {};
		InputStream inputStream = TypeReference.class.getResourceAsStream(JSON_DATA_FILE);
		try {
			featureCollection = mapper.readValue(inputStream, typeReference);			
		} catch (IOException e) {
			System.out.println("Unable to parse json data: " + e.getMessage());
		}		
	}

	@Override
	public List<IFeature> getAllFeatures() {
		List<IFeature> featureList = new ArrayList<IFeature>();

		for (IFeatureCollection featureCollection: featureCollection) {
			IFeature[] features = featureCollection.getFeatures();
			for (IFeature feature: features) {
				featureList.add(feature);				
			}
		}
		
		return featureList;
	}
}
