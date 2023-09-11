package com.y4j.AL.states;

import java.util.*;

public class UsingAL {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	ArrayList<String> states = new ArrayList();
	states.add("Andhra Pradesh");
	states.add("Uttar Pradesh");
	states.add("Arunachal Pradesh");
	states.add("Assam");
	states.add("Telangana");
	states.add("Karnataka");
	states.add("Kerala");
	states.add("Tamil Nadu");
	
	HashMap<String,String> abbreviation = new HashMap();
	abbreviation.put("AP", "Andhra Pradesh");
	abbreviation.put("UP", "Uttar Pradesh");
	abbreviation.put("AR", "Arunachal Pradesh");
	abbreviation.put("AS", "Assam");
	abbreviation.put("TS", "Telangana");
	abbreviation.put("KA", "Karnataka");
	abbreviation.put("KR", "Kerala");
	abbreviation.put("TS", "Telangana");
	
	System.out.println("Enter the abbreviation to get the Full name of State:");
	 String abbreviation1 = sc.nextLine().toUpperCase();
	 String fullform = abbreviation.get(abbreviation1);
	 
	 if(fullform != null) {
		 System.out.println("The full name of the"+" " +abbreviation1+" " + "state is: " +fullform);
	 }else {
			System.out.println(abbreviation1 +" "+"is not found. Please try some other valid names from the list");

	 }
	
	
	
	

}
}
