package Solution;

//package Solution;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int inputInt1 = scan.nextInt();
		double inputDouble1 = scan.nextDouble();
		scan.nextLine();
		String name = scan.nextLine();

		System.out.println(inputInt1 + 4);
		System.out.println(inputDouble1 + 4);
		System.out.println("HackerRank " + name);
	}

}
