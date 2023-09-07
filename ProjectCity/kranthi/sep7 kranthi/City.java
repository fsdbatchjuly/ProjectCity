package com.y4j.oops.kranthi;
import java.util.ArrayList;
import java.util.List;

public class City {

	 private String name;
	    private List<Hospital> hospitals;
	    private List<PoliceStation> policeStations;
	    private List<RailwayStation> railwayStations;
	    private List<Mall> malls;
	    private List<BusStand> busStands;
	    private List<College> colleges;
	
	     City(String name) {
	        this.name = name;
	        this.hospitals = new ArrayList<>();
	        this.policeStations = new ArrayList<>();
	        this.railwayStations = new ArrayList<>();
	        this.malls = new ArrayList<>();
	        this.busStands = new ArrayList<>();
	        this.colleges = new ArrayList<>();
	    }
	     
	     public void addHospital(Hospital hospital) {
	         hospitals.add(hospital);
	     }

	     public void addPoliceStation(PoliceStation policeStation) {
	         policeStations.add(policeStation);
	     }

	     public void addRailwayStation(RailwayStation railwayStation) {
	         railwayStations.add(railwayStation);
	     }
	     public void addMall(Mall mall) {
	         malls.add(mall);
	     }

	     public void addBusStand(BusStand busStand) {
	         busStands.add(busStand);
	     }

	     public void addCollege(College college) {
	         colleges.add(college);
	     }

	     public String getName() {
	         return name;
	     }
}
