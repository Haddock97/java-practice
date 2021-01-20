import java.util.*;

public class hashTest {
	public static void main(String[] args) {
		hashTest ex = new hashTest();
		ex.test();
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
	public void test() {
		System.out.println("twoIntSum method takes an int array and an int sum and will return true if two values in the arr add to the required sum.");
		int[] a = {1, 2, 3, 4, 5};
		int sum = 9;
		System.out.println("Our initial input is: 1 2 3 4 5 and target sum is 9");
		boolean b = twoIntSum(a, sum);
		System.out.println("Our answer is: " + b);
	}
}
