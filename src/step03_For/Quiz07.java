package step03_For;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i =1; i <= x; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            System.out.println("Case #"+i+": "+(A+B));            
        }
	}
}
