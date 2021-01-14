package step05_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Quiz03 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int ABC = A*B*C;			
		int N = (int)(Math.log10(ABC)+1);				
		int [] arr = new int[N];		
		System.out.println(ABC);
		for(int i = 0; i< N; i++) {
			arr[i] = ABC%10;			
			ABC = (ABC-arr[i])/10;			
		}	
		int[] count = new int[10];
		for(int j = 0; j < 10; j++) {
			for(int a: arr) {
				if(a == j) {
					count[j] ++;
				}
			}
		}
		
	}
}
