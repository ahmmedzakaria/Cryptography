package math;

public class GCD {
	
	//Euclidean reduction
	public static int getGCD(int num1, int num2) {
		if(num1>0 || num2>0) {
			if(num1 ==0) return num2;
			else if(num2 ==0) return num1;
			int a = num1;
			int b = num2;
			int mod = a%b;
			a = b;
			b = mod;
			
			return getGCD(a,b);
		}else {
			
			return -1;
		}
		
		
	}
}
