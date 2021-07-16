package run.math;

import math.GCD;

public class GCDTest {

	public static void main(String[] args) {
		int gcd1 = GCD.getGCD(11, 4);
		System.out.println(gcd1);
		
		int gcd2 = GCD.getGCD(5, 0);
		System.out.println(gcd2);
		
		System.out.println(GCD.getGCD(0, 5));
		System.out.println(GCD.getGCD(0, 0));

	}

}
