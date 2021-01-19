//main file
import java.util.*;

public class makeFreq{
	
	public HashMap<pair, Integer> getFreq(List<pair> input) {
		HashMap<pair, Integer> freq = new HashMap<pair, Integer>();
		for (int i = 0; i < input.size(); i++) {
			if (freq.containsKey(input.get(i)))
				freq.put(input.get(i), freq.get(i)+1);
			else
				freq.put(input.get(i), 1);
		}
		return freq;
	}

	public void getFreqTest() {
		pair a = new pair(1, 2);
		pair b = new pair(1, 2);
		pair c = new pair(2, 3);
		ArrayList<pair> l = new ArrayList<pair>();
		l.add(a);
		l.add(b);
		l.add(c);
		System.out.println("Our initial list contains the following pairs: ");
		printList(l);
		HashMap<pair, Integer> result = getFreq(l);
		System.out.println("\nOur results are: ");
		for (Map.Entry<pair, Integer> entry : result.entrySet()) {
			pair key = entry.getKey();
			int value = entry.getValue();
			key.printPair();
			System.out.println(" frequency = " + value);
		}
	}

	public void printList(List<pair> l) {
		for (pair item : l) {
			item.printPair();
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		makeFreq test = new makeFreq();
		test.getFreqTest();
	}
}































