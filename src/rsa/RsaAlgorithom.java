package rsa;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.IntStream;

import math.CoPrime;

public class RsaAlgorithom {
	
	public int[] getTwoUniquePrimeNumber(){
		return new int[]{29999999,29999989};
		//return new int[]{13,11};
	}
	
	// multiplication of two distinct prime numbers
	//n
	public int getN(int[] primeNumbers) {
		return IntStream.of(primeNumbers)
				.reduce(1, (product, element) -> product * element);
	}
	
	public int getPhiOfPrimeNumbers(int[] primeNumbers){
		
		return IntStream.of(primeNumbers)
		.map(n -> n-1)
		.reduce(1, (product, element) -> product * element);	 
	}
	
	//e
	public int getPublicKey(int phiValue) {
		List<Integer> coPrimes = CoPrime.getCoprimes(phiValue);
		//coPrimes.forEach(System.out::println);
		if(coPrimes.size()>0)
			return coPrimes.get(3);
		
		return -1;
		
	}
	
	//d
	public int getPrivateKey(int phiValue, int publicKey) {
		
		for (int i = 1; i < phiValue; i++) {
			//d = ((phi * i)+1)/e
			double d = (double)(phiValue*i +1)/(double)publicKey;
			System.out.println(d);
			if(d % 1 ==0) return (int)d; // means d don't have any decimal point
		}
	
		return -1;
	}
	
	public BigInteger getCypherTextValue(int publicKey, int n, int plainTextAsNumber) {
		double d=  (Math.pow(plainTextAsNumber, publicKey)) % n;
		BigInteger cypherTxtAsNumber = BigDecimal.valueOf(d).toBigInteger(); 
		
	return cypherTxtAsNumber;
	}
	
	public BigInteger getPlainTextValue(int privateKey, int n, BigInteger cypherTextAsNumber) {
		BigInteger plainTextAsNumber = cypherTextAsNumber.pow(privateKey).mod(BigInteger.valueOf(n));
		  
		  return plainTextAsNumber;
	}
	
//	public int getPhiOfPrimeNumbers(List<Integer> primeNumbers){
//		int[] primitive = primeNumbers.stream()
//                .filter(Objects::nonNull)
//                .mapToInt(Integer::intValue)
//                .toArray();
//		
//		return IntStream.of(primitive)
//		.map(n -> n-1)
//		.sum();	 
//	}
}
