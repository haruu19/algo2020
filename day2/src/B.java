
public class B {

	public static void main(String[] args) {
		// 교환(Swap)

		int a, b;
		a = 3;
		b = 5;
		int tmp;
		System.out.println(a + " , " + b);
		//교환
		tmp = a;
		a=b;
		b=tmp;
		
		System.out.println(a + " , " + b);
		//로테이션
		int[] arr= {4,2,7,8,1};
		//int[] arr;
		//arr = new int[]{4,2,7,8,1}
		//이 두 줄을 축약한 것
		tmp = arr[0];
		int size = arr.length-1;
		for(int i = 0; i<size;i++) {
			arr[i]=arr[i+1];	
		}arr[4] = tmp;
		
		for(int su : arr) {
			System.out.println(su);
		}
		//최댓값 구하기
		arr = new int[] {4,3,6,8,9};
		int max = Integer.MIN_VALUE;
	//	int min = Integer.MAX_VALUE;
		for (int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		// 두 수 중에서 큰 값을 구하여 출력하라
		int x= 10;
		int y = 20;
		max = Integer.MIN_VALUE;
		max = Math.max(max, x);
		max = Math.max(max, y);
//		if(x<y) {
//			max=y;
//		}else
//			max=x;
		System.out.println(max);
	}

}
