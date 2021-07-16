package run.math;

import java.math.BigInteger;

import rsa.RsaAlgorithom;
import util.Printer;

public class RSATest {

	public static void main(String[] args) {
		RsaAlgorithom rsa = new RsaAlgorithom();
		
		int plainTextAsNumber = 4;
		
		int[] primes = rsa.getTwoUniquePrimeNumber();
		int n = rsa.getN(primes);
		int phi = rsa.getPhiOfPrimeNumbers(primes);
		
		int publicKey = rsa.getPublicKey(phi);
		int privateKey = rsa.getPrivateKey(phi, publicKey);
		
		BigInteger cypherTextAsNumber = rsa.getCypherTextValue(publicKey, n, plainTextAsNumber);
		BigInteger decrypTextAsNumber = rsa.getPlainTextValue(privateKey, n, cypherTextAsNumber);
		
		System.out.println("plainTextAsNumber: "+plainTextAsNumber);
		System.out.println("primes: "+primes[0]+" "+primes[1]);
		System.out.println("n: "+n);
		System.out.println("phi: "+phi);
		System.out.println("publicKey: "+publicKey);
		System.out.println("privateKey: "+privateKey);
		System.out.println("cypherTextAsNumber: "+cypherTextAsNumber);
		System.out.println("decrypTextAsNumber: "+decrypTextAsNumber);
//		Printer.print(
//				"plainTextAsNumber: "+plainTextAsNumber,
//				"primes: "+primes[0]+" "+primes[1],
//				"n: "+n,
//				"phi: "+phi,
//				"publicKey: "+publicKey,
//				"cypherTextAsNumber: "+cypherTextAsNumber,
//				"decrypTextAsNumber: "+decrypTextAsNumber
//				
//				);
	}

}
