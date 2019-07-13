package com.up42.coding.challenge.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.up42.coding.challenge.interfaces.IProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties implements IProperties{
	private String id;
	
	private String quicklook;

	private long timestamp;

	private Acquisition acquisition;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getQuicklook() {
		return quicklook;
	}

	public void setQuicklook(String quicklook) {
		this.quicklook = quicklook;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public Acquisition getAcquisition() {
		return acquisition;
	}

	public void setAcquisition(Acquisition acquisition) {
		this.acquisition = acquisition;
	}

	@Override
	public String toString() {
		return "Properties [id=" + id + ", quicklook=" + quicklook + ", timestamp=" + timestamp + ", acquisition="
				+ acquisition + "]";
	}

}
