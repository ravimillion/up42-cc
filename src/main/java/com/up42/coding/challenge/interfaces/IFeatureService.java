package com.up42.coding.challenge.interfaces;

import java.util.List;

import com.up42.coding.challenge.interfaces.IFeatureDef;

public interface IFeatureService {

	public List<IFeatureDef> getFeatures();

	public IFeatureDef getFeature(String id);

	public byte[] getFeatureQuicklook(String id);
}
