package step01_InOutCalculations;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();        
        
        System.out.println(a+b);
	}
}
