public class main {


	public static int i = 2;
	public static int factorize(long x) {
		while( !isPrime(i) ) i++; //gets i to the next prime num

		//if x is not evenly divisible, increase i to the
		//next prime number and factorize 
		if( (x % i) == 0) {
			//output prime factors of x
			System.out.println("| " + i + " | ");

			//if x has not been reduced to a prime number,
			//divide by the prime number i and
			//factorize
			if( !isPrime(x) ) {
					factorize(x/i);
			}
		} else {
			i++;
			factorize(x);
		}


		return 0;
	}
	//Returns true if param is a prime number
	public static boolean isPrime(long x) {
		if( x <= 1) return false;

		for(int i = 2; i <= (x/2); i++) {
			if( x%i == 0) return false;
		}

		return true;
	}
	public static void main(String [] args) {
		long n = Long.parseLong(args[0]);
		System.out.println(factorize(n));
	}
}
