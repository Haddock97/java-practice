import java.util.*;

public class practice {
	// input: int[][] array containing [x,y] coordinates and can have repeats 
	// output: int[][] array containing [x,y,f] where f is the frequency
	// example: [[1,2],[1,2],[1,3]] --> [[1,2,2],[1,3,1]]
	public int[][] makeFreq(int[][] input) {
		HashMap<Integer[], Integer> freq = new HashMap<Integer[], Integer>();
		Integer[] key = new Integer[2];
		for (int i = 0; i < input.length; i++) {
			key[0] = input[i][0];
			key[1] = input[i][1];
			System.out.println(key[0] + " " + key[1]);
			if (freq.containsKey(key))
				freq.put(key, freq.get(key) + 1);
			else
				freq.put(key, 1);
		}
		int[][] result = new int[freq.size()][3];
		int idx = 0;
		for (Map.Entry<Integer[], Integer> entry : freq.entrySet()) {
			Integer[] k = entry.getKey();
			int v = entry.getValue();
			result[idx][0] = k[0];
			result[idx][1] = k[1];
			result[idx][2] = v;
			idx++;
		}
		return result;
	} 
	//test case for our first makeFreq method
	public void testMakeFreq() {
		System.out.println("Testing makeFreq method.");
		int[][] test = {{1,2}, {1,2}, {2, 3}};
		System.out.println("Our test input: ");
		print2dArray(test);
		int[][] result = makeFreq(test);
		System.out.println("Our result: ");
		print2dArray(result);
	}
	public void print2dArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("Hello, this is a practice program developed by Sidd in order to do various tasks.");
		practice example = new practice();
		example.testMakeFreq();
	}
}
