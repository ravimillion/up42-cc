package com.up42.coding.challenge.service;

import com.up42.coding.challenge.interfaces.IFeatureDef;

public class FeatureDef implements IFeatureDef{
	public String id;
	public String missionName;

	public long timestamp;
	public long beginViewingDate;
	public long endViewingDate;

	public FeatureDef(String id, String missionName, long timestamp, long beginViewingDate, long endViewingDate) {
		super();
		this.id = id;
		this.missionName = missionName;
		this.timestamp = timestamp;
		this.beginViewingDate = beginViewingDate;
		this.endViewingDate = endViewingDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMissionName() {
		return missionName;
	}

	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public long getBeginViewingDate() {
		return beginViewingDate;
	}

	public void setBeginViewingDate(long beginViewingDate) {
		this.beginViewingDate = beginViewingDate;
	}

	public long getEndViewingDate() {
		return endViewingDate;
	}

	public void setEndViewingDate(long endViewingDate) {
		this.endViewingDate = endViewingDate;
	}

}
