package strings;

public class WordReverse {

	public static void main(String[] args) {
		//Reversing words in the string
		String str = "Welcome to Java World";
		
		String splitArr[] = str.split(" ");
		for (int i=splitArr.length-1;i>=0;i--) {
			System.out.println(splitArr[i]);
		}
	}
}
