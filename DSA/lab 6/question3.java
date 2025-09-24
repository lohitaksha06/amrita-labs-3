// given a stack of size n delete its n middle element without using any extra data structure

import java.util.Stack;

public class question3 {
	static void deleteMiddle(Stack<Integer> st) {
		int n = st.size();
		if (n == 0) return;
		int k = n / 2; 
		removeAt(st, k);
	}

	static void removeAt(Stack<Integer> st, int k) {
		if (k == 0) {
			st.pop();
			return;
		}
		int x = st.pop();
		removeAt(st, k - 1);
		st.push(x);
	}

	static void print(Stack<Integer> st) {
		Stack<Integer> tmp = new Stack<>();
		while (!st.isEmpty()) { tmp.push(st.pop()); }
		while (!tmp.isEmpty()) {
			int x = tmp.pop();
			System.out.print(x + " ");
			st.push(x);
		}
		System.out.println();
        
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1); st.push(2); st.push(3); st.push(4); st.push(5);
		print(st);
		deleteMiddle(st);
		print(st);
	}
}
