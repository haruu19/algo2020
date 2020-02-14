import java.util.Scanner;

public class Day2Work2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		int[] arr;
//		int[] brr;
//		boolean succes;
		int sub=-1;
		for(int i = 0;i<TC;i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
//			int H_M = M/2;
			// 이걸 이용한 시간 단축방식을 알아보자
			arr= new int[N];
			for (int j = 0;j<N;j++) {
				arr[j]= sc.nextInt();
//				if(H_M<arr[j])
			}
//			brr= new int[N];
//			int tmp;
			for (int j = 0;j<N;j++) {
				for(int k = 0; k< N; k++) {
					if(j == k) {
						continue;
					}
					if(arr[j]+arr[k]>M) {
						continue;
					}
					sub = Math.max(sub, arr[j]+arr[k]);
				}
				
//				System.out.println(arr[j]);
			}
			System.out.println("#"+(i+1)+" "+ sub);
			sub = -1;
			
		}

	}

}
