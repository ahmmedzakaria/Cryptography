package util;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {
	public static List<Integer> getASCIIValues(String str){
		List<Integer> ascii = new ArrayList<>();
		if(str != null) {
			char[] charectars =str.toCharArray();
			
			for (int i = 0; i < charectars.length; i++) {
				ascii.add((int)charectars[i]);
			}
		}
		
		return ascii;
	}
	
	public static String getStringFromASCIIValues(List<Integer> asciis){
		char[] chacrectars = new char[asciis.size()];
		if(asciis != null) {
			for (int i = 0; i < asciis.size(); i++) {
				chacrectars[i] = (char)(int)asciis.get(i);
			}
			
		}
		
		return new String(chacrectars);
	}
}
