package step03_For;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i<N; i++) {
			int A = scan.nextInt();
			if(A < X) {
				sb.append(A+" ");
			}
		}
		System.out.println(sb);   
	}
}
