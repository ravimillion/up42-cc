package com.up42.coding.challenge.service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.up42.coding.challenge.interfaces.IFeature;
import com.up42.coding.challenge.interfaces.IFeatureDAO;
import com.up42.coding.challenge.interfaces.IFeatureDef;
import com.up42.coding.challenge.interfaces.IFeatureService;

@Component
public class FeatureService implements IFeatureService {
	@Autowired
	private IFeatureDAO featureDAO;

	@Override
	public List<IFeatureDef> getFeatures() {
		List<IFeature> features = featureDAO.getAllFeatures();
		List<IFeatureDef> featureDefs = new ArrayList<>();
		for (IFeature f : features) {
			featureDefs.add(new FeatureDef(f.getId(), f.getMissionName(), f.getTimestamp(), f.getBeginViewingDate(),
					f.getEndViewingDate()));
		}
		return featureDefs;
	}

	@Override
	public FeatureDef getFeature(String id) {		
		// TODO throw exception
		return null;
	}

	@Override
	public byte[] getFeatureQuicklook(String id) {		
		// TODO throw exception
		return null;		
	}
}