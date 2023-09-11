package com.y4j.AL.states;

import java.util.*;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		HashMap<String,String> states = new HashMap();
		states.put("AP", "Andhra Pradesh");
		states.put("AR", "Arunachal Pradesh");
		states.put("TN", "Tamil Nadu");
		states.put("TS", "Telangana");
		states.put("KA", "Karnataka");
		states.put("KL", "Kerala");
		states.put("MP", "Madhya Pradesh");
		states.put("MH", "Maharashtra");
		states.put("JK", "Jharkhand");
		states.put("UP", "Uttar Pradesh");
		states.put("AS", "Assam");
		states.put("BR", "Bihar");
		states.put("CG", "Chattisgargh");
		states.put("GA", "Goa");
		states.put("GJ", "Gujarat");
		states.put("HR", "Haryana");
		states.put("HP", "Himachal Pradesh");
		states.put("MN", "Manipur");
		states.put("ML", "Meghalaya");
		states.put("MZ", "Mizoram");
		states.put("NL", "Nagaland");
		states.put("OR", "Orissa");
		states.put("PB", "Punjab");
		states.put("RJ", "Rajasthan");
		states.put("SK", "Sikkim");
		states.put("TR", "Tripura");
		states.put("UK", "Uttarakhand");
		states.put("WB", "West Bengal");
		states.put("AN", "Andaman and Nicobar Islands");
		states.put("CH", "Chandigargh");
		states.put("DH", "Dadra and Nagar Haveli");
		states.put("DD", "Daman and Diu");
		states.put("DL", "Delhi");
		states.put("LD", "Lakshadweep");
		states.put("PY", "Pondicherry");
		
		
		
		System.out.println("Enter the abbreviation to get the Full name of State:");
		String abbreviation = scanner.nextLine().toUpperCase();
		String fullform = states.get(abbreviation);
		
		if(fullform != null) {
			System.out.println("The full name of the"+" " +abbreviation+" " + "state is: " +fullform);
			
		}else {
			System.out.println(abbreviation +" "+"is not found. Please try some other valid names from the list");
		}
		
		

	}

}
