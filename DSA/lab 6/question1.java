// write a program using stack operation to check whether a given string of brackets is blanaced or not. a string is said to be balanced if: every opening bracket (,[, or { has a corresponding closing bracket ), ], or }, in the correct order])
//for example [{()}]-balanced "(]" - not balanced 
// "[()(){}"-balanced "([{]}])"-not balanced


public class question1 {
	static boolean isBalanced(String s) {
		if (s == null) return true;
		char[] st = new char[s.length()];
		int top = -1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				st[++top] = c;
			} else if (c == ')' || c == ']' || c == '}') {
				if (top < 0) return false;
				char o = st[top--];
				if (!match(o, c)) return false;
			}
		}
		return top == -1;
	}

	static boolean match(char o, char c) {
		return (o == '(' && c == ')') || (o == '[' && c == ']') || (o == '{' && c == '}');
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String in = sc.nextLine();
		if (isBalanced(in)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
		sc.close();
	}
}
