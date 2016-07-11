package com.cs544.ftrms.model;

import java.util.List;

public interface IAircraft {
	public List<Aircraft> getListOfAircraft();
	public Aircraft getAircraft(String callSign);
	public void deleteAircraft(String callSign);
}
