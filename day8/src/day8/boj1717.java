package day8;

import java.util.Scanner;
import java.util.Scanner;

public class boj1717 {

	static int T,N,M,op,n1,n2;
	static int[] parent;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		parent = new int[N+1];
		makeset();
		M = sc.nextInt();
		for(int i=0;i<M;i++) {
			op = sc.nextInt();
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			if(op==0) {
				union(n1,n2);
			}else {
				if(findset(n1)==findset(n2)) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}
	}
	
	static int findset(int x) {
		if(x==parent[x]) {
			return x;
		}else {
			return parent[x] = findset(parent[x]);
		}
	}
			
	
	static void union(int x, int y) {
		if(findset(x)==findset(y)) {
			return;
		}else {
			parent[findset(x)]=findset(y);
		}
	}
	
	static void makeset() {
		for(int i=0;i<parent.length;i++)
			parent[i]=i;
	}
}