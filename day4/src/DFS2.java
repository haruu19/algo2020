import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DFS2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int N = sc.nextInt();
		int[][] data = new int[N +1][N + 1];
		boolean[] v = new boolean[N + 1];
		int a,b;
		int M = sc.nextInt();
		for(int i=1;i<=M;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			data[a][b]=1;
			data[b][a]=1;
		}
		dfs(data,v,1);
	}
	static void dfs(int[][] data, boolean[] v,int idx) {
		//종료조건
		
		//실행코드
		System.out.print(idx+" ");
		v[idx] = true;
		//재귀
		for(int i=1;i<data.length;i++) {
			if(v[i])
				continue;
			if(data[idx][i]==0)
				continue;
			dfs(data,v,i);
		}
	}
}
