//write a java program to reverse a given string using stackx
import java.util.Stack;
import java.util.Scanner;

public class question2{

    
    public static String reverse(String input) {
        Stack<Character> stack = new Stack<>();

        
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = reverse(str);
        System.out.println("Reversed string: " + result);

        sc.close();
    }
}

