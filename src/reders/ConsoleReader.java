package reders;

import java.util.Scanner;

public class ConsoleReader {

	public static String readFromConsole() {
		String str = null;
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		
		scanner.close();
		return str;
	}
}
