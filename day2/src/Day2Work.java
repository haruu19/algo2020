
public class Day2Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5];
		int tmp=1;
		int[] dx = {0,0,-1,1};
		int[] dy = {1,-1,0,0};
		int sum=0;
		//int aa = Math.abs(2-7);	// 절댓값
		for(int i = 0; i< arr.length;i++) {
			for(int j = 0; j< arr[i].length;j++) {
				arr[i][j]=tmp;
				tmp++;
			}
		}
		for(int nn=0;nn<25;nn++) {
			for(int i =0;i<4;i++) {
				if(((nn/5)+dx[i])<0 || ((nn/5)+dx[i])>4) {
					continue;
				}
				if(((nn%5)+dy[i])<0 || ((nn%5) + dy[i])>4) {
					continue;
				}
				sum += Math.abs(arr[(nn/5)+dx[i]][(nn%5)+dy[i]]-arr[nn/5][nn%5]);
			}
		}
		
		System.out.println(sum);
		
		
		
		
		//22358
//		for(int i = 0; i< arr.length;i++) {
//			for(int j = 0; j< arr[i].length;j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
	}

}
