package step05_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Quiz04_02 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int i;
		ArrayList list = new ArrayList();
		
		for (i = 0; i < arr.length; i++) {
			arr[i] = (Integer.parseInt(br.readLine()) % 42);
		}
		for(int a : arr) {
			if(!list.contains(a)) {
				list.add(a);
			}
		}
		System.out.println(list.size());		
	}
}
