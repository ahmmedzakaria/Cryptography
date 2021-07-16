package run.math;

import java.math.BigInteger;
import java.util.List;

import math.PrimeNumbers;

public class PrimeTest {
//	public static void main(String[] args) {
//		List<BigInteger> primes = PrimeNumbers.getPrimesSieve(BigInteger.valueOf(10));
//		//List<Integer> primes = PrimeNumbers.getPrimesSieve(10000);
//		primes.forEach(System.out::println);
//		
//	}
	
	
	public static void main (String[] args)  {
	    int n = 30000000;

	    boolean[] isPrime = new boolean[n+1];
	    for (int i = 2; i <= n; i++) {
	        isPrime[i] = true;
	    }

	    for (int factor = 2; factor*factor <= n; factor++) {
	        if (isPrime[factor]) {
	            for (int j = factor; factor*j <= n; j++) {
	                isPrime[factor*j] = false;
	            }
	        }
	    }

	    for (int i = 2; i <= n; i++) {
	        if (isPrime[i]) System.out.println(i);
	    }
	}
}
