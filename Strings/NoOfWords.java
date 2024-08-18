package strings;

import java.util.Scanner;

public class NoOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:\t");
		String str = sc.nextLine();
		int count = countNoOfWords(str);
		System.out.println("No of Words:"+count);
		sc.close();
		

	}

	private static Integer countNoOfWords(String str) {
		// TODO Auto-generated method stub
		int count = 0;
		if(str.charAt(0)!=' ') {
			count++;
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' '&&str.charAt(i+1)!=' ') {
				count++;
			}
		}
		return count;
	}
	
}
