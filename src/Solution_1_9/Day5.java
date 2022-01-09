package Solution_1_9;

import java.io.*;

public class Day5 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		for (int j = 1; j < 11; j++) {
			System.out.println(n + " x " + j + " = " + n * j);
		}

		bufferedReader.close();
	}
}
