package com.up42.coding.challenge.interfaces;

import com.up42.coding.challenge.data.Acquisition;

public interface IProperties {
	public String getId();

	public String getQuicklook();

	public long getTimestamp();

	public Acquisition getAcquisition();
}
