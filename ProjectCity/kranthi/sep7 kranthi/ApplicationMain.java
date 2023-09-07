package com.y4j.oops.kranthi;

public class ApplicationMain {

	

	public static void main(String[] args) {
		
		City city1 = new City("hyderabad");
        
         
        
        Hospital hospital1 = new Hospital("hyderabad  apollo", "madhapur", 200, "Cardiology",  true, true);
        city1.addHospital(hospital1);
         
        PoliceStation policestation1 = new PoliceStation("hyderabad  cyberabad ","kukatpally",50, "Si",true,true);
        city1.addPoliceStation(policestation1);
        
        Mall Mall1 = new Mall("hyderabad ", "inorbit", 5, "store", false, false);
        city1.addMall(Mall1);
        
        
	}

}
