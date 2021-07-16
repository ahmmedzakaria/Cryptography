package run.reders;

import java.util.List;

import reders.ConsoleReader;
import util.StringUtil;

public class ConsoleScanTest {

	public static void main(String[] args) {
		String str = ConsoleReader.readFromConsole();
		System.out.println(str);
		
		List<Integer> ascii = StringUtil.getASCIIValues(str);
		ascii.forEach(System.out::println);
//		char[] charectars =str.toCharArray();
//		
//	//	int c =charectars[0];
//		for (int i = 0; i < charectars.length; i++) {
//			System.out.println((int)charectars[i]);
//		}
		
		
	}

}
