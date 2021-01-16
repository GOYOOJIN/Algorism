package step04_While;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Quiz02 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String st; 
		
		while ((st = br.readLine()) != null) {	
			int A = st.charAt(0) - 48;
			int B = st.charAt(2) - 48;
			sb.append(A+B).append("\n");
		}
		System.out.println(sb);
	}
}
