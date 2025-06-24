package com.day12;
import java.util.*;
public class StackPractice {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(15);
		stack.push(20);
		stack.push(25);
		stack.push(30);
		stack.add(3, 404);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
	}
}
