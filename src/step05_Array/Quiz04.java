package step05_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz04 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int[] countArr = new int[10];
		int count = 1;
		int i;
		int j;
		for (i = 0; i < arr.length; i++) {
			arr[i] = (Integer.parseInt(br.readLine()) % 42);			
		}		
		for (j = 0; j < i; j++) {
			if (arr[i] == arr[j]) {
				}
			}
		}
		/*
		 * for (int j = 1; j < arr.length; j++) { if (arr[j - 1] == arr[j]) { count++;
		 * countArr[j - 1] = count; } else { countArr[j] = count; }
		 * System.out.println(countArr[j - 1]); } System.out.println(countArr.length);
		 */
	}
