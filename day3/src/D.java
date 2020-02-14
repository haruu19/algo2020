
public class D {
	
/*	static int digitSum(int data, int sum) {
		if(data==0) {
			return sum;
		}
		int mok = data / 10;
		int nam = data % 10;
		sum += nam;
		return digitSum(mok,sum);
	}*/
/*	static int digitSum(int data) {
		if(data==0) {
			return 0;
		}
		int mok = data / 10;
		int nam = data % 10;
		return nam + digitSum(mok);
	}*/
	/*static int digitSum(int data) {
		if(data==0) {
			return 0;
		}
		int mok = data / 10;
		int nam = data % 10;
		return nam + digitSum(mok);
	}*/
	static void digitSum(int data) {
		if(data==0) {
			return;
		}
		int mok = data / 10;
		int nam = data % 10;
		sum+=nam;
		digitSum(mok);
		//return nam + digitSum(mok);
	}
	static int sum;
	public static void main(String[] args) {
		// 4. 자연수를 넣어 그 각자리수의 합을 반환하는 재귀함수를 만들어라
		// int sum = digitSum(12356,0);
		//int sum = digitSum(12356,0);
		//int sum = digitSum(12356);
		digitSum(12356);
		System.out.println(sum);
		
		
		/*	int N = 47;
		int result = fibo(N);
		System.out.println(result);
		int[] arr = new int[7+1];
		arr[1] = 1;
		arr[2] = 1;
		for(int i = 2; i <arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println(arr[N]);
		int a = 1;
		int b = 1;
		int c = 0;
		for(int i=0;i<7-2;i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(c);*/
	}
	static int fibo(int num) {
		//종료
		if(num==1||num==2) {
			return 1;
		}
		//실행
		int res = fibo(num-1)+fibo(num-2);
		//재귀호출
		return res;
	}

/*	static int digitSum(int num) {
		//종료
		if(num/10==0)
			return num%10;
		//실행
		//재귀호출
		return digitSum(num/10)+num%10;
	}*/
	
	
}
