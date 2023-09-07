package com.y4j.oops.kranthi;

import java.util.List;

public class Hospital {
	
	
	private String name;
	private String address;
	private int capacity;
	private String departments;
	private boolean emergencyServicesAvailable;
	private boolean parkingAvailable;

	 Hospital(String name, String address, int capacity, String string, boolean emergencyServicesAvailable, boolean parkingAvailable) {
	    this.name = name;
	    this.address = address;
	    this.capacity = capacity;
	    this.departments = string;
	    this.emergencyServicesAvailable = emergencyServicesAvailable;
	    this.parkingAvailable = parkingAvailable;
	}

	

	



	public void admitPatient(String patientName) {
	    System.out.println("Admitting " + patientName + " to " + name + " Hospital.");
	}

	public void performSurgery(String patientName) {
	    System.out.println("Performing surgery on " + patientName + " at " + name + " Hospital.");

}
}