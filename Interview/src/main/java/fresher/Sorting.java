package fresher;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(2, 4, 67, 67, 4, 23, 68, 35, 44, 676, 34, 676);

		// Treeset stores on;y unique elements and stores in assending order only

		Set<Integer> uniqueElements = new TreeSet<Integer>();

		for (Integer i : list1) {
			if (!uniqueElements.add(i)) {
				System.out.println(i);
			}
		}

		System.out.println(uniqueElements);

	}

}
