import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ1260_DFS와BFS {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		int[][] map = new int[N+1][N+1];
		boolean[] v = new boolean[N+1];
		int x,y;
		for(int i=1;i<=M;i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			map[x][y] = 1;
			map[y][x] = 1;
		}
		
		
		dfs(map,v,V);
		System.out.println();
		boolean[] v2 = new boolean[N+1];
		bfs(map,v2,V);
		
	}
	
	static void bfs(int[][] map, boolean[] v, int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		int idx;
		while(!q.isEmpty()) {
			idx = q.poll();
			v[idx] = true;
			System.out.print(idx+" ");
			for(int i=1;i<map.length;i++) {
				if(v[i])
					continue;
				if(map[idx][i]==0)
					continue;
				q.offer(i);
				v[i] = true;
			}
		}
	}
	
	
	static void dfs(int[][] map, boolean[] v, int start) {
		
		System.out.print(start+" ");
		v[start] = true;
		
		for(int i=1;i<map.length;i++) {
			if(v[i])
				continue;
			if(map[start][i]==0)
				continue;
			dfs(map,v,i);
		}
		
	}
	
}
