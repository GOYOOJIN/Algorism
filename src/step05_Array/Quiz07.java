package step05_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz07 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		int i;
		int j;
		
		String score = "";	

		for (i = 0; i < C; i++) {
			score = br.readLine();	
			String[] scoreArr = new String[C];	
			scoreArr[i] = score;
			for(j = 0; j < score.length(); j++) {
				scoreArr[i].split("");
			}
		}		

	}
}
