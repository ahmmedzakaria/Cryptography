package run.math;

import java.util.List;

import math.ModularArithmetics;

public class MultiplicativeInverseTest {

	public static void main(String[] args) {
		int mInverse = ModularArithmetics.getMultiplicativeInverse(26, 3);
		//mInverse.forEach(System.out::println);
		System.out.println(mInverse);
		
		List<Integer> mInverses =ModularArithmetics.getMultiplicativeInverse(26);
		System.out.println("mInverses========");
		mInverses.forEach(System.out::println);
	}

}
