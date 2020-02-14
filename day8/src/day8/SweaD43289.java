package day8;

import java.util.Scanner;

public class SweaD43289 {
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
				op = sc.nextInt();
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				if(op==0) {
					union(n1,n2);
				}else {
					if(findset(n1)==findset(n2)) {
						//							System.out.print("1");
						ans.append("1");
					}else {
						//							System.out.print("0");
						ans.append("0");

					}
				}
			}
			System.out.println("#"+t+" "+ans.toString());
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
