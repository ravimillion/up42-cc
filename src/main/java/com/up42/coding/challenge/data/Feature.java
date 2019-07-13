package com.up42.coding.challenge.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.up42.coding.challenge.interfaces.IFeature;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Feature implements IFeature {
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String getId() {
		return properties.getId();
	}

	@Override
	public long getTimestamp() {
		return properties.getTimestamp();
	}

	@Override
	public long getBeginViewingDate() {
		return properties.getAcquisition().getBeginViewingDate();
	}

	@Override
	public long getEndViewingDate() {
		return properties.getAcquisition().getEndViewingDate();
	}

	@Override
	public String getMissionName() {
		return properties.getAcquisition().getMissionName();
	}

	@Override
	public String getQuicklook() {
		return properties.getQuicklook();
	}
	

	@Override
	public String toString() {
		return "Feature [properties=" + properties + "]";
	}
}
