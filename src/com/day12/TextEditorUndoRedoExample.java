package com.day12;

import java.util.*;

public class TextEditorUndoRedoExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<String> undo = new Stack<>();
		Stack<String> redo = new Stack<>();

		List<String> words = new ArrayList<>();

		while (true) {
			System.out.print("enter input function to perform ");
			String input = scanner.nextLine().trim();
			if (input.equalsIgnoreCase("undo")) {
				if (!words.isEmpty()) {
					String lastWord = words.remove(words.size() - 1);
					redo.push(lastWord);
				} else {
					System.out.println("Nothing to undo.");
				}

			} else if (input.equalsIgnoreCase("redo")) {
				if (!redo.isEmpty()) {
					String word = redo.pop();
					words.add(word);
				} else {
					System.out.println("Nothing to redo.");
				}

			} else if (input.equalsIgnoreCase("show")) {
				System.out.println("Current Text: " + String.join(" ", words));

			} else if (input.equalsIgnoreCase("exit")) {
				System.out.println("Exiting");
				break;

			} else {
				String[] inputWords = input.split("\\s+"); 
				for (String word : inputWords) {
					words.add(word);
				}
				System.out.println(words);
				redo.clear();
			}
		}

		scanner.close();
	}
}
