package step03_For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Quiz04 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 1; i<=T; i++) {
			StringTokenizer X =new StringTokenizer(br.readLine());
			int A = Integer.parseInt(X.nextToken());
			int B = Integer.parseInt(X.nextToken());
			bw.write(A+B+"\n");			
		}        
		bw.flush();
        bw.close();
	}
}
