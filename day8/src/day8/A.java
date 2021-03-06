package day8;

public class A {
	static int[] parent;
	public static void main(String[] args) {
		//10개정도의 집합이 있어서 그 집합을 서로소집합으로 관리하기
		parent = new int[10+1];
		makeset();
//		int idx = findset(2);
		union(2,5);
		union(4,7);
		union(5,4);
//		System.out.println(idx);
		System.out.println(findset(2));
		System.out.println(findset(7));
	}
	
	static int findset(int x) {
		if(x==parent[x]) {
			return x;
		}
//		return findset(parent[x]);
		return parent[x] = findset(parent[x]);
	}
	
	static void union(int x,int y) {
		x = findset(x);
		y = findset(y);
		if(x==y) {
			return;
		}
		parent[y] = x;
	}
	static void makeset() {
		for(int i=1;i<parent.length;i++) {
			parent[i] = i;
		}
	}
}
