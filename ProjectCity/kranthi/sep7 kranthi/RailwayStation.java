package com.y4j.oops.kranthi;

public class RailwayStation {

	
	 private String name;
	    private String location;
	    private int platforms;
	    private boolean isTicketBookingAvailable;
	    private boolean isRestroomAvailable;
	    private String trainSchedule;

	    public RailwayStation(String name, String location, int platforms, boolean isTicketBookingAvailable, boolean isRestroomAvailable, String trainSchedule) {
	        this.name = name;
	        this.location = location;
	        this.platforms = platforms;
	        this.isTicketBookingAvailable = isTicketBookingAvailable;
	        this.isRestroomAvailable = isRestroomAvailable;
	        this.trainSchedule = trainSchedule;
	    }
	    
	    public void close() {
	        System.out.println(name + " Railway Station is now closed.");
	    }
	    
	    public void displayTrainSchedule() {
	        System.out.println("Train schedule at " + name + " Railway Station:");
	      
	           
}
}