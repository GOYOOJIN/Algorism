package step05_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Quiz07 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int C = Integer.parseInt(br.readLine());
		int i;
		int j;
		int t;
		int sum = 0;
		int count = 0;
		double avg = 0.0;
		int[] score; 

		for (i = 0; i < C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			t = Integer.parseInt(st.nextToken());
			score = new int[t];
			for (j = 0; j < t; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
			}
			sum = sum / t;			
			System.out.println(sum);
		}
		bw.flush();
		bw.close();
	}
}
