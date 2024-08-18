package strings;

import java.util.Iterator;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Compare 2 strings without any in-built functions
		String str1 = "Hello";
		String str2 = "Hello";
		boolean isCompare=false;
		
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				isCompare = false;
			}
			isCompare=true;
			
		}
		System.out.println("Both the Strings are equal:\t"+isCompare);
		
	}

}
