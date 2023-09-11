import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class State {

	public static void main(String[] args) {
		
		ArrayList<String> codes = new ArrayList();
		codes.add("AP");
	    codes.add("TS");
	    codes.add("MH");	
	    codes.add("TN");
	    codes.add("UP");
	    codes.add("HP");
	    codes.add("KA");
	    codes.add("PN");
	    codes.add("PY");
	    codes.add("DD");
	    
	   
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the abbreviation to get the Full name of State:");
        String userInput = scanner.nextLine().toUpperCase();
	   
	   
	  ArrayList<String>statename = new ArrayList();
	  
	 
	   statename.add("Andhrapradesh");
	   statename.add("Telangana");
	   statename.add("Maharastra");
	   
	   statename.add("Tamilnadu");
	   
	   statename.add("Uttarpradesh");
	   statename.add("karnataka");
	   statename.add("himachal pradesh");
	   statename.add("punjab");
	   
	   statename.add("delhi");
	   
	   statename.add("haryana");
	 
	   
	   for (int i = 0; i < codes.size(); i++) {
           String abbreviation = codes.get(i);
           if (abbreviation.equals(userInput)) {
               String stateName = statename.get(i);
               System.out.println(userInput + " is the abbreviation for " + stateName);
              
       }
	   }
       
	   }
	   }


	   
	   
	   
	
	   
	

	