package JavaCodeingPractice;

public class FindnearestPrime {

	    public static void main(String[] args) {
	        int number = 20;
	        System.out.println("Closest prime to " + number + " is " + findClosestPrime(number));
	    }

	    public static int findClosestPrime(int number) {
	        int lower = number - 1;
	        int higher = number + 1;

	        while (true) {
	            if (isPrime(lower)) {
	                return lower;
	            }
	            if (isPrime(higher)) {
	                return higher;
	            }
	            lower--;
	            higher++;
	        }
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }
	}


