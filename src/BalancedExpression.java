package src;

import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

public class BalancedExpression {

	public static void main(String[] args) {
		boolean isBalanced = false;
		String expression = "";
		String exp = "{([])}";
		String exp1 = "{([])()}";
		String exp2 = "{([])(}"; //unbalanced
		String exp3 = "()}"; //unbalanced
		String exp4 = "{()"; //unbalanced
		
		boolean balanced=false;
		
		//stack to store open braces in sequential order
		Stack<Character> stack = new Stack<>();
		
		//map open brace to its closing brace
		HashMap<Character, Character> hm= new HashMap<>();
		hm.put('{', '}');
		hm.put('(', ')');
		hm.put('[', ']');
		
		//keyset of hm to see if characters from expression is open brace, and then push to stack
		Set<Character> keySet = hm.keySet();
		
		expression = exp3;
		
		for(int i = 0; i < expression.length(); i++) {
			if(keySet.contains(expression.charAt(i))){
				stack.push(expression.charAt(i));
			}
			else {
				if(!stack.empty()) {
					if(expression.charAt(i) == hm.get(stack.peek())) {
						stack.pop();
						balanced=true;
					}
					else {
						//when closing bracket is not pairing with stack top open bracket
						balanced=false;
						break;
					}
				}else {
					//when close brace found but stack is empty
					balanced=false;
					break;
				}
			}
		}
		
		if(!stack.empty()) {
			balanced = false;
		}
		if(balanced) {
			System.out.println("Expression is balanced");
		}else {
			System.out.println("Unbalanced expression");
		}
		
	}

}
