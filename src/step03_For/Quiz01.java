package step03_For;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.close();
		for (int j = 1; j <= 9; j++) {
			System.out.println(i + " * " + j + " = " + (i * j));
		}
	}
}
