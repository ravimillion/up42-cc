package com.up42.coding.challenge.data;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.up42.coding.challenge.interfaces.IFeatureCollection;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeatureCollection implements IFeatureCollection {
	private Feature[] features;
	
	public Feature[] getFeatures() {
		return features;
	}

	public void setFeatures(Feature[] features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "FeatureCollection [features=" + Arrays.toString(features) + "]";
	}
}
