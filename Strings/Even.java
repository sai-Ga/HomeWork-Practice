package strings;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hell World We LOL LMAO";
		for (String s : str.split(" ")) {
			if(s.length()%2==0) {
				System.out.println(s);
			}
			
		}
	}

}
