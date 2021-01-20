import java.util.*;

public class hashTest {
	public static void main(String[] args) {
		hashTest ex = new hashTest();
		ex.testTwoIntSum();
		System.out.println("");
		ex.testThreeIntSum();
	}
	
	//helper function to print int array
	public void printIntArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public boolean twoIntSum(int[] arr, int sum) {
		HashMap<Integer, Integer> solution = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (solution.containsKey(arr[i]))
				return true;
			else
				solution.put(sum - arr[i], 1);
		}
		return false;
	}

	public void testTwoIntSum() {
		System.out.println("twoIntSum method takes an int array and an int sum and will return true if two values in the arr add to the required sum.");
		int[] a = {1, 2, 3, 4, 5};
		int sum = 9;
		System.out.println("Our initial input is: ");
		printIntArray(a);
		System.out.println(" and our target sum is: " + sum);

		boolean b = twoIntSum(a, sum);
		System.out.println("Our answer is: " + b);
	}
	
	/* Brute Force Solution
	public boolean threeIntSum(int[] arr, int sum) {
		if (arr.length < 3)
			return false;
		for (int i = 0; i < arr.length - 2; i++)
			for (int j = i+1; i < arr.length - 1; j++)
				for (int k = j+1; k < arr.length; k++)
					if (arr[i]+arr[j]+arr[k] == sum)
						return true;
		return false;
	}
	*/

	public boolean threeIntSum(int[] arr, int sum) {
		if (arr.length < 3)
			return false;
		HashMap<Integer, HashMap<Integer, Integer>> solution = new HashMap<Integer, HashMap<Integer, Integer>>();
		/*
		for (int i = 0; i < 2; i++) {
			HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
			for (int j = i+1; j < arr.length; j++)
				temp.put(sum - arr[i] - arr[j], 1);
			solution.put(arr[i], temp);
		}
		*/
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++)
				if (solution.get(arr[j]).containsKey(arr[i]))
					return true;
			HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
			for (int k = i+1; k < arr.length; k++)
				temp.put(sum - arr[k] - arr[i], 1);
			solution.put(arr[i], temp);
		}

		return false;
	}

	public void testThreeIntSum() {
		System.out.println("threeIntSum method takes an int array and an int sum and will return true if three values in the arr add to the required sum.");
		
		int[] a = {1, 2, 3, 4, 5};
		int sum = 9;
		System.out.println("Our initial input is: ");
		printIntArray(a);
		System.out.println(" and our target sum is: " + sum);
		boolean b = threeIntSum(a, sum);
		System.out.println("Our answer is: " + b);
		
		int[] a2 = {1, 1, 1, 1};
		int sum2 = 3;
		System.out.println("\nOur next input is: ");
		printIntArray(a2);
		System.out.print(" and our target sum is: " + sum2);
		boolean b2 = threeIntSum(a2, sum2);
		System.out.println("\nOur answer is: " + b2);

		int[] a3 = {1, 2, 3, 4};
		int sum3 = 200;
		System.out.println("\nOur last input is: ");
		printIntArray(a3);
		System.out.print(" and our target sum is: " + sum3);
		boolean b3 = threeIntSum(a3, sum3);
		System.out.println("\nOur answer is: " + b3);
	}
}
