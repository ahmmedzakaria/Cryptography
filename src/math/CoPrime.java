package math;

import java.util.ArrayList;
import java.util.List;

public class CoPrime {
	
	//If GCD of two numbers is 1 then the numbers are Co-prime
	public static boolean isCoPrime(int num1, int num2) {
		boolean isCoPrime = false;
		
		int gcd = GCD.getGCD(num1, num2);
		if(gcd ==1) isCoPrime = true;
		
		//System.out.println("num1: "+num1+" num2: "+num2+" gcd: "+gcd);
		
		return isCoPrime;
	}
	
	public static List<Integer> getCoprimes(int modulus) {
		List<Integer> coPrimes = new ArrayList<>();
		for (int i = 1; i < modulus; i++) {
			boolean isCoprime = isCoPrime(modulus, i);
			if(isCoprime) coPrimes.add(i);
		}
		
		return coPrimes;
	}
	

}
