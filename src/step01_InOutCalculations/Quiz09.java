package step01_InOutCalculations;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        scan.close();
	}
}
