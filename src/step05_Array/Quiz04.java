package step05_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz04 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int[] countArr = new int[10];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (Integer.parseInt(br.readLine()) % 42);
		}
	}
}