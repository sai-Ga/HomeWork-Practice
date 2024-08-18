package strings;

import java.util.Stack;

public class WellFormed { //Parentheses checker

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{()[][[]][]}"; //chk later if this is working properly
		Stack<Character> st = new Stack<>();
		for(int i=0; i<str.length();i++) {
			/* goal: to chk if there's an equivalent closing 
			 * braces/brackets/sq.brackets for all the opened parentheses
			 * 
			 * logic: push all the opening braces into the stack & pop the top
			 * element from the stack if the top element is == to the 
			 * closing parentheses we've come across during string traversal
			 *  */
			char ch = str.charAt(i);
			if(st.empty()) {
				st.push(ch);
			}
			else if(ch == '{'||ch=='('|| ch=='[') {
				st.push(ch);
				
			}else if(ch == '}'&& st.peek()=='{') {
				st.pop();
				
			}else if(ch == ')'&& st.peek()=='(') {
				st.pop();
				
			}else if(ch == ']'&& st.peek()=='[') {
				st.pop();
				
			}
			
		}
		if(st.empty()) {
			System.out.println("Given String is well formed");
		}else {
			System.out.println("Given String is NOT well formed");
		}
	}

}
