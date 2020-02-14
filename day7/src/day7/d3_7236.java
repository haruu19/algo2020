package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d3_7236 {

	static int[] dx= {1,-1,0,0,1,1,-1,-1};
	static int[] dy= {0,0,1,-1,1,-1,1,-1};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			int N = Integer.parseInt(br.readLine());
			String[][] a= new String[N][N];
			String s;
			StringTokenizer st;
			for(int i=0;i<N;i++) {
				s = br.readLine();
				st = new StringTokenizer(s);
				for(int j=0;j<N;j++) {
					a[i][j] = st.nextToken();
				}
			}
			int x,y,nx,ny;
			int sum = 0;
			int max = Integer.MIN_VALUE;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(a[i][j].equals("G"))
						continue;
					x=i;
					y=j;
					sum = 0;
					for(int k=0;k<8;k++) {
						nx = x+dx[k];
						ny = y+dy[k];
						if(nx<0||nx>=N||ny<0||ny>=N)
							continue;
						if(a[nx][ny].equals("W"))
							sum++;
					}
					if(sum<=1) {
						max=Math.max(max, 1);
					}else {
						max=Math.max(max,sum);
					}
				}
			}
			System.out.println("#"+t+" "+max);
		}
	}
}
