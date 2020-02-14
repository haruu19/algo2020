import java.util.LinkedList;
import java.util.Queue;

public class Mirro2 {
	static int[][] map;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static boolean[][] v;
//	static int result;
	static int min;
	static int cnt1=0;
	
	public static class Pos{
		int x;
		int y;
		int cnt=0;
		
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		map = new int[][]{  
			{0,0,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,1},
			{1,1,1,0,1,1,1,1},
			{1,1,1,0,1,1,1,1},
			{1,0,0,0,0,0,0,1},
			{1,0,1,0,0,0,1,1},
			{1,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,0}
		};
		min = Integer.MAX_VALUE;
		result=0;
		v = new boolean[map.length][map[0].length];
		v[0][0] = true;
//		dfs(0,0,0);
//		System.out.println("end"+result+" , "+min);
		
		bfs(map, 0,0);
		System.out.println("end");
	}
	
	static int result = 999_999_999;
	static void bfs(int[][] map, int x, int y) {
		boolean[][] v = new boolean[8][8];
		Queue<Pos> q = new LinkedList<>();
		q.offer(new Pos(x,y));
		Pos p = null;
		int nx,ny;
		while(!q.isEmpty()) {
			p = q.poll();
			//방문체크
			v[p.x][p.y]=true;
			//업무실행
			System.out.println("("+p.x+","+p.y+")");
			if(p.x==7&&p.y==7) {
				System.out.println("cnt : " + (p.cnt ));
				result = Math.min(result, p.cnt);
//				break;
			}
			//인접한 정점 실행
			for(int i=0;i<4;i++) {
				nx = p.x + dx[i];
				ny = p.y + dy[i];
				if(nx<0||nx>=map.length||ny<0||ny>=map.length)
					continue;
				if(map[nx][ny]==1)
					continue;
				if(v[nx][ny])
					continue;
				Pos temp = new Pos(nx, ny);
				temp.cnt = p.cnt+1;
//				q.offer(new Pos(nx,ny));
				q.offer(temp);
				v[nx][ny]=true;
			}
		}
		System.out.println();
	}
	
	
	static void dfs(int x,int y,int cnt) {
		//종료
		if(x==map.length-1&&y==map.length-1) {
			result =1;
			min = Math.min(min, cnt);
			System.out.println("cnt : " + cnt);
			System.out.println("cnt1 : " + cnt1);
			return;
		}
		//실행 및 재귀
		int nx,ny;
		for(int i=0;i<4;i++) {
			nx = x + dx[i];
			ny = y + dy[i];
			if(nx<0||nx>=map.length||ny<0||ny>=map.length) 
				continue;
			if(v[nx][ny])
				continue;
			if(map[nx][ny]==1)
				continue;
			v[nx][ny] = true;
			cnt1 = cnt1 + 1;
			dfs(nx,ny,cnt+1);
			//백트래킹
			cnt1 = cnt1 - 1;
			v[nx][ny] = false;
 		}
	}
}
