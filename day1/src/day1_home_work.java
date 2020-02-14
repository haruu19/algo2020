import java.util.Scanner;

public class day1_home_work {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] score = new int[101];
		int best;
		int count;
		int tmp;
		int a;
		
		for(int i=0; i<n;i++) {
			for(int j = 0; j<101;j++) {score[j]=0;}
			//|->Arrays.fill(score,0);
			//자바는 배열을 생성하면 자동 초기화
			//=>score = new int[101];
			//위의 2줄 생략 가능
			//	int[] score = new int[101];
			//for(int j = 0; j<101;j++) {score[j]=0;}
			//주석을 다는 습관
			//프림, 그래프, 원탐,?,
			count = 0;best=0;
			a = sc.nextInt();
			for(int j=0; j<1000; j++) {
				tmp = sc.nextInt();
				score[tmp]++;
				if(count<score[tmp]) {count = score[tmp]; best=tmp;}
				else if(count==score[tmp]&&best<tmp) {best = tmp;}
				else {}
			}
			System.out.println("#"+a+" "+ best);
		}
	}
}