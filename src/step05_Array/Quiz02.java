package step05_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Quiz02 {
	public static void main(String args[]) throws IOException {
		int[] numArr = new int[9];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int max = numArr[0];
		int index = 0;
		for (int i = 0; i < 9; i++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}

		for (int m = 0; m < numArr.length; m++) {
			if (max < numArr[m]) {
				max = numArr[m];
				index = m+1;
			}			
		}
		System.out.println(max);
		System.out.println(index);
	}
}
