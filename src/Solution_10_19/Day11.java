package Solution_10_19;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Day11 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<List<Integer>> arr = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

			List<Integer> arrRowItems = new ArrayList<>();

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowTempItems[j]);
				arrRowItems.add(arrItem);
			}

			arr.add(arrRowItems);
		}

		Calculate(arr);
		bufferedReader.close();
	}

	public static void Calculate(List<List<Integer>> arr) {

		List<Integer> arrCalculate = new ArrayList<>();
		List<Integer> arrCalculate2 = new ArrayList<>();

		int max = -1000;

		for (int i = 0; i < arr.size() - 2; i++) {
			for (int j = 0; j < arr.size() - 2; j++) {
				arrCalculate.add(arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2));
				arrCalculate.add(arr.get(i + 1).get(j + 1));
				arrCalculate.add(arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2));
			}
		}

		for (int i = 0; i <= arrCalculate.size() - 3; i += 3) {
			arrCalculate2.add(arrCalculate.get(i) + arrCalculate.get(i + 1) + arrCalculate.get(i + 2));
			if (max < arrCalculate.get(i) + arrCalculate.get(i + 1) + arrCalculate.get(i + 2)) {
				max = arrCalculate.get(i) + arrCalculate.get(i + 1) + arrCalculate.get(i + 2);

			}
		}

		System.out.println(max);

	}
}
