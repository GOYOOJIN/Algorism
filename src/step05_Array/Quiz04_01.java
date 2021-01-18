package step05_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Quiz04_01 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int i;
		for (i = 0; i < arr.length; i++) {
			arr[i] = (Integer.parseInt(br.readLine()) % 42);
		}
		Set<Integer> set = new HashSet<Integer>();
		for (int a : arr) {
			set.add(a);
		}
		System.out.println(set.size());
		
	}
}
