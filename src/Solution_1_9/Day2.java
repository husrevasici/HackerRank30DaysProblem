package Solution_1_9;

import java.io.*;

public class Day2 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

		int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

		int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

		Result.solve(meal_cost, tip_percent, tax_percent);

		bufferedReader.close();
	}
}

class Result {

	public static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double result = meal_cost * tip_percent / 100;
		result = meal_cost + result + (meal_cost * tax_percent / 100);

		System.out.println((int) Math.round(result));
	}

}