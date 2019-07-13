package com.up42.coding.challenge.interfaces;

import java.util.List;

public interface IFeatureDAO {

	public void loadJSONData();

	public List<IFeature> getAllFeatures();
}
