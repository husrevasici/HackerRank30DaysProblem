package Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Day7 {
	static List<Integer> revList = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		long startTime = System.nanoTime();

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrTemp[i]);
			arr.add(arrItem);
		}

		Collections.reverse(arr);
		System.out.println(arr);
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}

//		arr = listReverse(arr);
//		printList(revList);

		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("total-time -> " + totalTime);

		bufferedReader.close();
	}

	public static List<Integer> listReverse(List<Integer> list) {

		for (int i = list.size() - 1; i >= 0; i--) {

			try {
				revList.add(list.get(i));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return revList;
	}

	public static void printList(List<Integer> rewList) {
		System.out.println(rewList);

	}

}
