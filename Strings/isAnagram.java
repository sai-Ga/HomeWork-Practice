package strings;

public class isAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(isAna("aaa","aaa"));
			
		}


	private static boolean isAna(String string1, String string2) {
		// TODO Auto-generated method stub
		int count[] = new int[256];
		for (int i=0;i<string1.length();i++) {
			count[string1.charAt(i)]++;
			count[string2.charAt(i)]--;
	}
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				return false;
			}
					}
return true;
		

	}

}
