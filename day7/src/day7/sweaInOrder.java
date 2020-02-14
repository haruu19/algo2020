package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sweaInOrder {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int t=1;t<=10;t++) {
			String s = br.readLine();
			int N = Integer.parseInt(s);
			System.out.print("#"+t+" ");
			char[] a = new char[N*2+2];
			String[] temp;
			for(int i=1;i<=N;i++) {
				s = br.readLine();
				temp = s.split(" ");
				a[i] = temp[1].charAt(0);
			}
			
			inOrder(a,1);
			System.out.println();
		}
	}
	static void inOrder(char[] a, int idx) {
		if(a[idx]=='\u0000')
			return;
		inOrder(a, idx*2);
		System.out.print(a[idx]);
		inOrder(a, idx*2+1);
	}
}
