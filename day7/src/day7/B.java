package day7;

public class B {
	public static void main(String[] args) {
		int size = 10;
		char[] datas = new char[26+1];
		for(int i=1;i<=size;i++) {
			datas[i]=(char)(i+64);//알파벳 입력
		}
		//inOrder()출력
		inOrder(datas,1);
		findParent(datas, 5);
		char[] chs = new char[2];
		chs = findChild(datas, 3);
		System.out.println(chs[0]+" "+chs[1]);
	}
	static void inOrder(char[] datas, int parent) {
		//종료
		if(datas[parent] == '\u0000') {
			return;
		}
		inOrder(datas, parent*2);
		System.out.println(datas[parent]);
		inOrder(datas,parent*2+1);
	}
	
	static void findParent(char[] datas, int n){
		if(n==1) {
			System.out.println("현재 데이터가 root");
			return;
		}
		System.out.println(datas[n/2]);
	}
	
	static char[] findChild(char[] datas, int idx) {
		char[] crr = {' ', ' '};
		int chIdx1 = idx*2;
		if(chIdx1< datas.length) {
			crr[0] = datas[chIdx1];
		}
		if(chIdx1+1< datas.length) {
			crr[1] = datas[chIdx1+1];
		}
		return crr;
	}
}
