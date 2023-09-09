package com.y4j.oops.building;

public class GatedCommunity {
	
	 private String name;
	    private String location;
	    private Building[] buildings;
	    private int numBuildings;

	    public GatedCommunity(String name, String location) {
	        this.name = name;
	        this.location = location;
	        this.buildings = buildings;
	        this.numBuildings = 0;
	    }

	    public void addBuilding(Building building) {
	        if (numBuildings < 4) {
	        	numBuildings++;
	        }
	    }
	    public void displayBuildings() {
	        System.out.println("\nBuildings in the community:");
	        for (int i = 0; i < numBuildings; i++) {
	            System.out.println(buildings[i]);
	        }
	    }
	

		    }
	









