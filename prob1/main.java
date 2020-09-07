public class main {

	/**
	 * Problem 1: If we list all the natural numbers below 10 that
	 * are multiples of 3 or 5, we get 3, 5, 6, and 9. The sum of
	 * these multiples is 23.
	 * Find the sum of all multiples of 3 and 5 below 1000.
	 * */

	/**
	 * Check if the given int is a multiple of 3 or 5, 
	 * return 0 otherwise
	 * */
	public static int mod(int x) {
		if((x % 3) == 0) return x;
		else if ((x % 5) == 0) return x;
		else return 0;
	}

	public static void main(String [] args) {
		int total = 0;
		for( int i = 0; i < 1000; i++){
			total += mod(i);
		}

		System.err.println(total);
   	 }
}
