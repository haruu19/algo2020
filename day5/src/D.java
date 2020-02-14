import java.util.LinkedList;
import java.util.Queue;

public class D {

	public static void main(String[] args) {
		int[][] graph = new int[9+1][9+1];
		graph[1][2] = 1;
		graph[2][1] = 1;

		graph[3][1] = 1;
		graph[1][3] = 1;

		graph[4][1] = 1;
		graph[1][4] = 1;

		graph[2][5] = 1;
		graph[5][2] = 1;

		graph[2][6] = 1;
		graph[6][2] = 1;

		graph[4][7] = 1;
		graph[7][4] = 1;

		graph[4][8] = 1;
		graph[8][4] = 1;

		graph[4][9] = 1;
		graph[9][4] = 1;
		
		bfs(graph, 1);
	}
	static char[] datas = {' ','A','B','C','D','E','F','G','H','I'};
	static void bfs(int[][] graph, int start) {
		boolean[] v = new boolean[9+1];
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		int idx=0;
		while(!q.isEmpty()) {
			idx=q.poll();
//			방문체크
			v[idx] = true;
//			업무실행
			System.out.print(datas[idx]+" ");
//			인접한 정점 실행
			for(int i=1;i<graph.length;i++) {
				if(v[i]) {
					continue;
				}
				if(graph[idx][i]==0) {
					continue;
				}
				q.offer(i);
			}
		}
	}
}
