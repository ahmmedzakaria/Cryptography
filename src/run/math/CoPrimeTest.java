package run.math;

import java.util.List;

import math.CoPrime;

public class CoPrimeTest {

	public static void main(String[] args) {
		List<Integer> coPromes = CoPrime.getCoprimes(120);
		System.out.println("coPromes========");
		coPromes.forEach(System.out::println);

	}

}
