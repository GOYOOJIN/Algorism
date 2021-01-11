package step02_If;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String args[]) {		
		Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int M = scan.nextInt();
                
        if(M<45){
            M += 60;
            H--;
            if(H < 0){
                H = 23;
            }
        }
        System.out.println(H+" "+(M-45));
        scan.close();
	}
}
