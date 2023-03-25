package stack4.dev;

import java.util.Stack;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(30);
		stack.push(50);
		stack.push(70);
		stack.push(100);
		
		System.out.println("Stack trước khi đảo ngược: ");
		System.out.println(stack);
		
		Stack<Integer> reversedStack = reveredStack(stack);
		
		System.out.println("Stack sau khi đảo ngược: ");
		System.out.println(reversedStack);
	}
	
	public static Stack<Integer> reveredStack(Stack<Integer> stack) {
		Stack<Integer> reversedStack = new Stack<>();
		
		while (!stack.isEmpty()) {
			reversedStack.push(stack.pop());
		}
		
		return reversedStack;
	}

}
