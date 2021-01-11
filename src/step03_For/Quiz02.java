package step03_For;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); 		
		int j = scan.nextInt();
		for(int i = 1; i<=j; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            System.out.println(A+B);
        }       
	}
}
