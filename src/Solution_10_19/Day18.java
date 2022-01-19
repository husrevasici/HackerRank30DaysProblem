package Solution_10_19;

import java.io.*;
import java.util.*;

public class Day18 {

	Queue<Character> queue = new LinkedList<>();
	Stack<Character> stack = new Stack<>();

	private Character popCharacter() {

		return stack.pop();

	}

	private Character dequeueCharacter() {

		return queue.remove();

	}

	private void pushCharacter(char c) {
		stack.push(c);

	}

	private void enqueueCharacter(char c) {
		queue.add(c);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Day18 p = new Day18();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}

}