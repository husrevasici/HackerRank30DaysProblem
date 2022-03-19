package Solution_10_19;

import java.io.*;
import java.util.*;

public class Day25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			if (isPrime(sc.nextInt()))
				System.out.println("Prime");
			else
				System.out.println("Not prime");
		}
	}

	private static boolean isPrime(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i < Math.sqrt(num); i++)
			if (num % i == 0)
				return false;
		return true;
	}
}