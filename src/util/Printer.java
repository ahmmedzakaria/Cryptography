package util;

public class Printer {

	public static void print(String ...arr) {
		for (String str : arr) {
			System.out.println(str);
		}
	}
	
	public static void print(String str, String msg) {
		System.out.println("\n========"+msg+"==========");
		System.out.println(str);
	}
	
	public static void print(Object obj, String msg) {
		System.out.println("\n========"+msg+"==========");
		System.out.println(obj);
	}
	
	public static void print(String str) {
		System.out.println("\n========"+"*******"+"==========");
		System.out.println(str);
	}
}
