package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class sweaSafe {

	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
//		String s = br.readLine();
//		char ch = s.charAt(0);
//		int T = Integer.valueOf(ch);
//		int T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
//			s = br.readLine();
//			StringTokenizer st = new StringTokenizer(s);
			int N = sc.nextInt();
			int B = sc.nextInt();
			int[][] a = new int[N+1][N+1];
			int x, y,nx,ny;
			for(int i=1;i<=B;i++) {
				x = sc.nextInt();
				y = sc.nextInt();
				for(int j=1;j<=2;j++) {
					for(int k=0;k<4;k++) {
						nx = x + dx[k]*j;
						ny = y + dy[k]*j;
						if(nx<1||nx>N||ny<1||ny>N)
							continue;
						a[nx][ny]++;
					}
				}
				a[x][y]++;
			}
			int max = Integer.MIN_VALUE;
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					max = Math.max(max, a[i][j]);
				}
			}
			System.out.println("#"+t+" "+max);
		}
	}
}
