package Solution_10_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day10 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		Convert(n);
		bufferedReader.close();
	}

	public static void Convert(int n) {

		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> listRepeatOneValue = new ArrayList<Integer>();

		while (n > 0) {

			if (n % 2 == 1) {
				list.add(n % 2);
				count++;
				listRepeatOneValue.add(count);

			}

			else {
				list.add(n % 2);
				count = 0;
			}
			n = n / 2;

		}
		Collections.reverse(list);

		System.out.println(Collections.max(listRepeatOneValue));
	}

}
