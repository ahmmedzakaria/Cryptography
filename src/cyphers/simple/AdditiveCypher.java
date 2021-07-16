package cyphers.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class AdditiveCypher {
	
	private int modulus;
	private int key;
	
	public AdditiveCypher(int modulus, int key ) {
		if(key>= modulus) throw new IllegalArgumentException("Key can't be grater then modulus");
		this.modulus = modulus;
		this.key = key;
	}
	
	private BiFunction<Integer, Integer, Integer > encryptLogic = (k,v) -> (v+k) % modulus;
	private BiFunction<Integer, Integer, Integer > decryptLogic = (k,v) -> (v+Math.abs(modulus-k)) % modulus;
	
	private int encrypt(int key, int value) {
		int cypher =-1;
		cypher = encryptLogic.apply(key, value);
		
		return cypher;
	} 
	
	private int decrypt(int key, int value) {
		int cypher =-1;
		cypher = decryptLogic.apply(key, value);
		
		return cypher;
	}
	
	public List<Integer> encrypt(List<Integer> values){
		List<Integer> cyphers = new ArrayList<>();
		values.forEach(value -> cyphers.add(encrypt(key, value)));
		
		return cyphers;
	}
	
	public List<Integer> decrypt(List<Integer> values){
		List<Integer> plainValues = new ArrayList<>();
		values.forEach(value -> plainValues.add(decrypt(key, value)));
		
		return plainValues;
	}
}
