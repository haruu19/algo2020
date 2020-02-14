
public class F {
	static int[] arr = {1,2,3,4,};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//methodA();
		//methodB();
		methodC();
	}
	static void methodC() {
		int size = 1 << arr.length;
		for(int i = 0;i < size ; i ++) {
			for(int j=0;j<arr.length;j++) {
				if((i&(1<<j))!=0) {
					//수행작업
					System.out.print(arr[j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	static void methodB() {
		boolean[] flag = new boolean[arr.length];
		powerSet(0,arr.length, flag);
	}
	static void powerSet(int idx, int maxSize, boolean[] flag) {
//		종료
		if(idx==maxSize) {
//			출력해보기		
			print(flag);
			return;
		}
//		실행
		flag[idx] = true;
//		재귀호출
		powerSet(idx+1,maxSize,flag);
//		실행
		flag[idx] = false;
//		재귀호출
		powerSet(idx+1,maxSize,flag);
	}
	static void methodA() {
		boolean[] flag = new boolean[arr.length];//false초기화
		for(int i=0;i<2;i++) {
			if(i%2==0) {
				flag[0]=true;
			}else {
				flag[0]=false;
			}
			for(int j=0;j<2;j++) {
				flag[1]=j%2==0? true:false;	
				for(int k=0;k<2;k++) {
					flag[2]=k%2==0?true:false;
					for(int l=0;l<2;l++) {
						flag[3]=l%2==0?true:false;
//						작업진행
						print(flag);
				}
			}
			
		}
	}
}
	static void print(boolean[] flag) {
		for(int i=0;i<arr.length;i++) {
			if(flag[i]) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
}