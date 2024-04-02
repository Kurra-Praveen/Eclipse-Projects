package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringsManuplation {

	public static int arrayStrength(int N, int[][] A) {
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int count = 0;
			int sum = 0;
			int strength = 0;
			for (int j = 0; j < N; j++) {
				if (A[i][j] > 0) {
					count += 1;
				}
				sum += A[i][j];
			}
			strength = (sum) % (1 + count);
			a.add(strength);
		}
		Collections.sort(a);
		String x="";
		for(int e:a) {
			x+=e;
		}
		int a1=Integer.parseInt(x);
		return a1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		System.err.println(arrayStrength(N, A));
	}
}
