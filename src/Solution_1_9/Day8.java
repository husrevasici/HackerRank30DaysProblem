package Solution_1_9;

import java.util.HashMap;
import java.util.Scanner;

public class Day8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			map.put(name, phone);
		}

		while (in.hasNext()) {

			String s = in.next();
			if (map.containsKey(s)) {
				System.out.println(s + "=" + map.get(s));
			} else {
				System.out.println("Not found");
			}

		}

		in.close();
	}

}
