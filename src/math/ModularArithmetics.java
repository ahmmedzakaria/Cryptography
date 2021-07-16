package math;

import java.util.ArrayList;
import java.util.List;

public class ModularArithmetics {

	public static int getMultiplicativeInverse(int modulus, int num) {
		
		if(num<modulus) {
			boolean isCoprime = CoPrime.isCoPrime(modulus, num);
			System.out.println("isCoprime: "+isCoprime);
			if(isCoprime) {
				for (int i = 0; i < modulus; i++) {
					int mod =(num * i) % modulus;
					//System.out.println("i: "+i+" modulus: "+modulus+" mod: "+mod);
					if(mod == 1) {
						return i;
					}
				}
			}
		}
		
		return -1;
	}
	
	public static List<Integer> getMultiplicativeInverse(int modulus) {
		List<Integer> inverse = new ArrayList<>();
		for (int i = 0; i < modulus; i++) {
			int inv =getMultiplicativeInverse(modulus, i);
			if(inv != -1) inverse.add(inv);
		}
		
		return inverse;
	}
}
