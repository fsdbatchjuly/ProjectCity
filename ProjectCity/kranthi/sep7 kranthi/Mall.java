package com.y4j.oops.kranthi;

public class Mall {
	
	 private String name;
	    private String address;
	    private int floors;
	    private String stores;
	    private boolean isFoodCourtAvailable;
	    private boolean isParkingAvailable;

	    public Mall(String name, String address, int floors, String stores, boolean isFoodCourtAvailable, boolean isParkingAvailable) {
	        this.name = name;
	        this.address = address;
	        this.floors = floors;
	        this.stores = stores;
	        this.isFoodCourtAvailable = isFoodCourtAvailable;
	        this.isParkingAvailable = isParkingAvailable;
	    }
	    public void shopAtStore(String storeName) {
	        System.out.println("Shopping at " + storeName + " in " + name + " Mall.");
	    }
	    
	    public void dineAtFoodCourt() {
	        System.out.println("Dining at the food court in " + name + " Mall.");
	    }
	}
