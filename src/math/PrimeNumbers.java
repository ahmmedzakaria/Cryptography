package math;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static List<Integer> getPrimesSieve(int length) {
		//int length =100;
		//0=not prime
		//1=prime
		int[] p = new int[length];
		
		//first mark all odd number's as prime
		for (int i = 3; i < p.length; i += 2) {
			p[i] =1;
		}
		
		//sieve
		for (int i = 3; i < p.length; i = i += 2) {
			//if the current number is not market as 0 then it is prime
			if(p[i] ==1) {
				//mark all the multiples of i as not prime
				for (int j = i*i; j < p.length; j = j+i) {
					p[j] = 0;
				}
			}
		}
		
		//special case
		p[0]=0;
		p[1]=0;
		p[2]=1;
		
		List<Integer> primes = new ArrayList<>();
		for (int i = 0; i < p.length; i++) {
			if(p[i] ==1) primes.add(i);
		}
		
		return primes;
		
	}
	
	public static List<BigInteger> getPrimesSieve(BigInteger length) {
		//int length =100;
		//0=not prime
		//1=prime
		int[] p = new int[length.intValue()];
		
		//first mark all odd number's as prime
		for (BigInteger i = BigInteger.valueOf(3); i.intValue() < p.length; i.add(BigInteger.TWO) ) {
			p[i.intValue()] =1;
		}
		
		//sieve
		for (BigInteger i = BigInteger.valueOf(3); i.intValue() < p.length; i.add(BigInteger.TWO) ) {
			//if the current number is not market as 0 then it is prime
			if(p[i.intValue()] ==1) {
				//mark all the multiples of i as not prime
				for (BigInteger j = i.pow(2); j.intValue() < p.length; j = j.add(i)) {
					p[j.intValue()] = 0;
				}
			}
		}
		
		//special case
		p[0]=0;
		p[1]=0;
		p[2]=1;
		
		List<BigInteger> primes = new ArrayList<>();
		for (BigInteger i = BigInteger.valueOf(0); i.intValue() < p.length; i.add(BigInteger.ONE)) {
			if(p[i.intValue()] ==1) primes.add(i);
		}
		
		return primes;
		
	}
}

