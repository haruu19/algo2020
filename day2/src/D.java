
public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {	{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		//특정한 좌표의 상,하,좌,우 값 출력
		int x, y;
		x=2;
		y=1;
		int value;
		int dx[] = {0,0,-1,1};
		int dy[] = {1,-1,0,0};
		int nx,ny;
		for (int i = 0 ; i<4;i++) {
			nx = x + dx[i];
			ny = y + dy[i];
			if(nx<0||ny<0||nx>3||ny>3) {
				continue;
			}
			value = arr[ny][nx];
		}
	}

}
