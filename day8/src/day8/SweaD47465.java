package day8;

import java.util.Scanner;

public class SweaD47465 {
	static int T,N,M,op,n1,n2;
	static int[] parent;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int t=1;t<=T;t++) {
			StringBuffer ans = new StringBuffer();
			//				System.out.print("#"+t+" ");
			N = sc.nextInt();
			parent = new int[N+1];
			for(int i=1;i<=N;i++)
				parent[i]=i;
			M = sc.nextInt();
			for(int i=0;i<M;i++) {
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				union(n1,n2);
			}
			int count=0;
			int[] cnt = new int[N+1];
			int n= findset(1);
			for(int i=1;i<=N;i++) {
				n = findset(i);
				cnt[n]++;
			}
			for(int i=1;i<=N;i++) {
				if(cnt[i]>0)
					count++;
			}
			System.out.println("#"+t+" "+count);
		}
	}   

	static int findset(int idx) {
		if (parent[idx] == idx) return idx;
		return parent[idx] = findset(parent[idx]);
	}

	static void union(int a, int b) {
		if (a == b) return;
		a = findset(a);
		b = findset(b);
		if (a==b) return;
		parent[b] = a;
	}
}