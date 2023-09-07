package com.y4j.oops.kranthi;

public class BusStand {
	
	 private String name;
	    private String location;
	    private int busCount;
	    private String busRoutes;
	    private boolean isWaitingAreaAvailable;
	    private boolean isRestroomAvailable;

	    public BusStand(String name, String location, int busCount, String busRoutes, boolean isWaitingAreaAvailable, boolean isRestroomAvailable) {
	        this.name = name;
	        this.location = location;
	        this.busCount = busCount;
	        this.busRoutes = busRoutes;
	        this.isWaitingAreaAvailable = isWaitingAreaAvailable;
	        this.isRestroomAvailable = isRestroomAvailable;
	    }
	    public void displayBusRoutes() {
	        System.out.println("Bus routes available at " + name + " Bus Stand:");
	        
	        }
	    
	    
	    public void boardBus(String busNumber) {
	        System.out.println("Boarding bus " + busNumber + " at " + name + " Bus Stand.");
	    }
}
