package step02_If;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextInt();
		double b = scan.nextInt();

		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}

		scan.close();
	}
}
