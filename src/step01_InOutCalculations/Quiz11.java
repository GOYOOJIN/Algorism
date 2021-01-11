package step01_InOutCalculations;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        int e = (b/100)*a;
        int d = ((b%100)/10)*a;
        int c = (b%10)*a;
        
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(c+(d*10)+(e*100));
        
        scan.close();
	}
}
