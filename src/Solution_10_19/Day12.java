package Solution_10_19;

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {

	private int[] testScores;

	public Student(String firstName, String lastName, int id, int[] testScores2) {
		super(firstName, lastName, id);
		this.testScores = testScores2;

	}

	public String calculate() {
		int max = 0;
		String result = null;
		for (int i = 0; i < testScores.length; i++) {
			max = testScores[i] + max;
		}
		max = max / testScores.length;

		if (max < 40) {
			result = "T";
		} else if (max < 55 & max >= 40) {
			result = "D";

		} else if (max < 70 & max >= 55) {
			result = "P";

		} else if (max < 80 & max >= 70) {
			result = "A";

		} else if (max < 90 & max >= 80) {
			result = "E";

		} else if (max <= 100 & max >= 90) {
			result = "O";

		} else {

		}

		return result;
	}

}

class Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}