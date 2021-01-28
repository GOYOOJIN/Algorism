package step04_While;

import java.io.IOException;
import java.util.Scanner;

public class Quiz03_02 {
	public static void main(String args[]) throws IOException {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int cnt = 0;
		int tmp = x;

		while (true) {
			int a = tmp / 10;
			int b = tmp % 10;
			if (a + b < 10) {
				tmp = b * 10 + a + b;
			} else {
				tmp = b * 10 + (a + b) % 10;
			}
			cnt++;
			if (tmp == x)
				break;
		}
		System.out.println(cnt);
		scan.close();
	}
}
