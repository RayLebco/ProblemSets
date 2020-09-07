public class main {

	/**
	 * Find the sum of the even-valued terms in the fibonacci sequence which 
	 * does not exceed 4,000,000
	 * */

	//Add the two previous numbers to get the next fib number
	public static int nextFib(int x, int y) {
		return (x + y);
	}

	//Check if the given int is even, return 0 if odd
	public static int addToTotal(int x) {
		if( (x % 2) == 0 ) return x;
		return 0;
	}

	public static void main(String [] args) {
		int a, b, c;
		int total = 2; //start total with 2
		a = 1; //first two fib numbers
		b = 2;
		c = 0; //swap value
		while( c <= 4000000 ) {
			c = nextFib(a, b); //calculate the next fib number
			total += addToTotal(c); 
			a = b; //swap numbers
			b = c;
		}

		System.err.println(total);
	}
}
