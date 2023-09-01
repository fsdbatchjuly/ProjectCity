import java.util.Random;
public class RandomInteger {

	public static void main(String[] args) {
		   int randomNumber = getRandomNumber();
	        System.out.println("Random Number: " + randomNumber);
	    }
	
	 public static int getRandomNumber() {
	        Random random = new Random();
	        return random.nextInt(100) + 1;
	    

	}

}
