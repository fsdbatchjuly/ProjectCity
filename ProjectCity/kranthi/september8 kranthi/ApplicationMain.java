package com.y4j.oops.building;

public class ApplicationMain {

	public static void main(String[] args) {
		
		Building building1 = new Building(1, 5, 20);
        Building building2 = new Building(2, 6, 18);
        Building building3 = new Building(3, 4, 15);
        Building building4 = new Building(4, 7, 22);
        
        GatedCommunity  community = new GatedCommunity("Gardenvilla", "123 madhapur");
        
        
	      
        
        community.addBuilding(building1);
        community.addBuilding(building2);
        community.addBuilding(building3);
        community.addBuilding(building4);

        System.out.println(community);
       
        community.displayBuildings();

	}

}
