package Solution_1_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		String[] array = new String[n];

		while (n > 0) {

			array[n - 1] = bufferedReader.readLine();

			for (int j = 0; j < array[n - 1].length(); j++) {
				if (j % 2 == 0) {
					char c = array[n - 1].charAt(j);
					System.out.print(c);

				}
			}
			System.out.print(" ");
			for (int j = 0; j < array[n - 1].length(); j++) {
				if (j % 2 == 1) {
					char c = array[n - 1].charAt(j);
					System.out.print(c);

				}
			}
			System.out.println();
			n--;
		} // end while

	} // end main

}
