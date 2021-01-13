package step05_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz01 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer X = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(X.nextToken());
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int m = 0; m<arr.length; m++) {
			if(max<arr[m]){
				max = arr[m];
			}
			if(min>arr[m]){
				min = arr[m];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
