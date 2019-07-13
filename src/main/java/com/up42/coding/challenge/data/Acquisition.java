package com.up42.coding.challenge.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.up42.coding.challenge.interfaces.IAcquisition;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Acquisition implements IAcquisition{
	private String mission;

	private String missionName;

	private long endViewingDate;

	private long beginViewingDate;

	public String getMission() {
		return mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	public String getMissionName() {
		return missionName;
	}

	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	public long getEndViewingDate() {
		return endViewingDate;
	}

	public void setEndViewingDate(long endViewingDate) {
		this.endViewingDate = endViewingDate;
	}

	public long getBeginViewingDate() {
		return beginViewingDate;
	}

	public void setBeginViewingDate(long beginViewingDate) {
		this.beginViewingDate = beginViewingDate;
	}

	@Override
	public String toString() {
		return "Acquisition [mission=" + mission + ", missionName=" + missionName + ", endViewingDate=" + endViewingDate
				+ ", beginViewingDate=" + beginViewingDate + "]";
	}

}
