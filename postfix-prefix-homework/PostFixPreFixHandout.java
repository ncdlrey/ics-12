/**
 * Write the program that determines whether any given string has a legal bracket structure.
 * Basically, make sure all the '(', ‘[‘, '{', and '<' have matching ')', ‘]‘, '}', and '>'. 
 * We also need to take nesting into account, so that '({)}'; is incorrect, and '({}<{}>)' will pass.
 *
 * @author Nicole Delos Reyes
 *
 */

import java.util.*;

public class PostFixPreFixHandout {

	public static void main(String[] args) {

		Stack<Character> stack = new Stack<Character>();

		Scanner scan = new Scanner (System.in);

		System.out.print("Enter string: ");
		
		String userString = scan.next();
		char arr[] = new char [userString.length()];

		for (int i=0; i<arr.length;i++) {
			arr[i] = userString.charAt(i);
		}

		// Go through array, add opening to stack
		for (int i = 0; i<arr.length;i++) {
			if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{' || arr[i] == '<' ) {
				stack.push(arr[i]);
			}
			else {
				// is no openings were added to stack, any closing will be deemed illegal by default
				if (stack.empty()) {
					System.out.println("Illegal bracket structure.");
					return; // so it doesn't print twice
				}
				else {
					char opening = (Character) stack.peek();
					if((arr[i]== ')' && opening == '(') || (arr[i]== '}' && opening == '{') || (arr[i]== ']' && opening == '[') || (arr[i]== '>' && opening == '<')){
						stack.pop();
					}
					else{
						System.out.println("Illegal bracket structure.");
						return; // so it doesn't print twice
			          }
				}
			}
		}	

		// check if stack is empty or not
		if (stack.empty()){
			System.out.println("Legal bracket structure");
		}
		else {
			System.out.println("Illegal bracket structure.");
		}
	}
}
