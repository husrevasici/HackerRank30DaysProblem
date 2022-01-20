package Solution_10_19;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator1 implements AdvancedArithmetic {
	public int divisorSum(int n) {
		int result = 0;

		for (int i = 1; i < n + 1; i++) {

			if (n % i == 0) {
				result += i;
			}
		}
		return result;

	}
}

class Day19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator1();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}