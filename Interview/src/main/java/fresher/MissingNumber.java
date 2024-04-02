package fresher;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(2, 4, 7, 8, 9, 1, 3, 6, 0);

		Integer max = Collections.max(list1);

		for (int i = 0; i <= max; i++) {
			if (!list1.contains(i)) {
				System.out.println(i);
			}
		}

		System.out.println(getMissingNumber(list1));

	}

	public static int getMissingNumber(List<Integer> list) {
		int n = Collections.max(list);

		int sumOfAllNumbers = n * (n + 1) / 2;

		int SumOfList = 0;
		for (Integer i : list) {
			SumOfList += i;
		}

		return sumOfAllNumbers - SumOfList;
	}
}
