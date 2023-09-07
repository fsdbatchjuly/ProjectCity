package com.y4j.oops.kranthi;

public class PoliceStation {

	
	  private String name;
	    private String address;
	    private int officersCount;
	    private String officers;
	    private boolean isEmergencyServiceAvailable;
	    private boolean isPrisonerHoldingArea;

	    public PoliceStation(String name, String address, int officersCount, String officers, boolean isEmergencyServiceAvailable, boolean isPrisonerHoldingArea) {
	        this.name = name;
	        this.address = address;
	        this.officersCount = officersCount;
	        this.officers = officers;
	        this.isEmergencyServiceAvailable = isEmergencyServiceAvailable;
	        this.isPrisonerHoldingArea = isPrisonerHoldingArea;
	    }
	    
	    public void reportCrime(String description) {
	        System.out.println("Reporting a crime: " + description);
	    }
	    
	    public void arrestSuspect(String suspectName) {
	        System.out.println("Arresting suspect: " + suspectName);
}
}