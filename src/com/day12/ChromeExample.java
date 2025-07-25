package com.day12;

import java.util.Stack;

public class ChromeExample {
	
	Stack<String> backStack = new Stack();
	Stack<String> forwardStack = new Stack();
	String currentPage = "Home";
	
	public void visit(String url) {
		backStack.push(currentPage);
		currentPage = url;
		forwardStack.clear();
		System.out.println("Visited : "+currentPage);
	}
	public void back() {
		if(!backStack.isEmpty()) {
			forwardStack.push(currentPage);
			currentPage = backStack.pop();
			System.out.println("Went back to : "+currentPage);
		}else {
			System.out.println("No pages to go back to");
		}
	}
	public void forward() {
		if(!forwardStack.isEmpty()) {
			backStack.push(currentPage);
			currentPage = forwardStack.pop();
			System.out.println("Went forward to : "+currentPage);
		}else {
			System.out.println("No pages to go to forward");
		}
		
	}
	public void currentPage() {
		System.out.println("Current Page : "+currentPage);
	}
	
	public static void main(String[] args) {
		ChromeExample history = new ChromeExample();
		history.visit("Google.com");
		history.visit("OpenAi.com");
		history.visit("Github.com");
		
		history.back();
		history.back();
		history.back();
		
		history.forward();
		history.visit("Stackoverflow.com");
		
		history.currentPage();
	}
}
