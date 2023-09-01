import java.util.Scanner;

public class Factors {

	
			 
	
	 public static int calculateFactorSum(int number) {
	        ArrayList<Integer> factors = new ArrayList<>();
	        int sum = 0;

	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) {
	                factors.add(i);
	                sum = sum + i;
	            }
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Number: ");
	        int num = scanner.nextInt();

	        int sum = calculateFactorSum(num);

	        System.out.println("Factors of " + num + " are " + factorsList(num) + ";");
	        System.out.println("Factors addition is " + sum + " in java");
	    }

	    public static ArrayList<Integer> factorsList(int number) {
	        ArrayList<Integer> factors = new ArrayList<>();

	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) {
	                factors.add(i);
	            }
	        }

	        return factors;
	    }
	}
