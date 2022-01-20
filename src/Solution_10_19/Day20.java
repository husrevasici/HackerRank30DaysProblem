package Solution_10_19;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class Day20 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());
		int numberOfSwaps = 0;
		for (int i = 0; i < a.size(); i++) {

			for (int j = 0; j < n - 1; j++) {
				if (a.get(j) > a.get(j + 1)) {
					swap(j, a);
					numberOfSwaps++;
				}
			}

			if (numberOfSwaps == 0) {
				break;
			}
		}

		System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
		System.out.println("First Element: " + a.get(0));
		System.out.println("Last Element: " + a.get(a.size() - 1));

		bufferedReader.close();
	}

	private static void swap(int j, List<Integer> a) {
		int change;
		change = a.get(j);
		a.set(j, a.get(j + 1));
		a.set(j + 1, change);

	}

}
