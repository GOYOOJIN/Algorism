package step03_For;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i = 1; i <= N; i++){
        	for(int x = N; x > i; x--) {
        		System.out.print(" ");        		
        	}  
        	for(int j = 1; j<=i; j++){
                System.out.print("*");
             }
           System.out.println();
        }
	}
}
