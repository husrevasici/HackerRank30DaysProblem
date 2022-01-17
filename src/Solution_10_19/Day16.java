package Solution_10_19;

import java.io.*;

public class Day16 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String S = bufferedReader.readLine();

		try {
			int i = Integer.parseInt(S);
			System.out.println(i);

		} catch (Exception e) {
			System.out.println("Bad String");
		}

		bufferedReader.close();
	}
}
