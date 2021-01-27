package step05_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz07 {
	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int[] arr;		
		int testcase = scan.nextInt();
		
		for(int i = 0 ; i < testcase ; i++) { 
			int N = scan.nextInt();	
			arr = new int[N];			
			double sum = 0;				
			for(int j = 0 ; j < N ; j++) {
				int val = scan.nextInt();	
				arr[j] = val;
				sum += val;
			}
			
			double mean = (sum / N) ;
			double count = 0; 			
			
			for(int j = 0 ; j < N ; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);				
		}
		scan.close();
	}
}
