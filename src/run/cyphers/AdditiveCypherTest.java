package run.cyphers;

import java.util.List;

import cyphers.simple.AdditiveCypher;
import reders.ConsoleReader;
import util.Printer;
import util.StringUtil;

public class AdditiveCypherTest {
	public static void main(String[] args) {
		String str =ConsoleReader.readFromConsole();
		List<Integer> intValues = StringUtil.getASCIIValues(str);
		
		intValues.forEach(System.out::print);
		Printer.print(str, "plain text");
		
		try {
			AdditiveCypher ad = new AdditiveCypher(4406, 11098);
			List<Integer> cypherInts = ad.encrypt(intValues);		
			cypherInts.forEach(System.out::print);
			String cypherTxt = StringUtil.getStringFromASCIIValues(cypherInts);
			Printer.print(cypherTxt, "Cypher text");
			
			List<Integer> plainInts = ad.decrypt(cypherInts);	
			plainInts.forEach(System.out::print);
			String plainText = StringUtil.getStringFromASCIIValues(plainInts);
			Printer.print(plainText, "Plain text");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
