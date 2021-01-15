package step05_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz05 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = 0;
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		double avg = 0.0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (M < arr[i]) {
				M = arr[i];
			}
			sum += arr[i];
		}
		avg = (double)((sum*100)/M)/N;	
		System.out.println(avg);
	}
}
