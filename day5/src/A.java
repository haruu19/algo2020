import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int t=1;t<=10;t++) {
			int T = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
//			Integer[] arr= {1,6,3,8,5,2};
//			Arrays.sort(arr,Comparator.reverseOrder());//내림차순할때사용
			
			long result =power(N,M);
	//		long result =(long)Math.pow(5,20);
			System.out.println("#"+T+" "+result);
		}
	}

	private static long power(int base, int exp) {
		//종료
		if(exp==1)
			return base;
		if(exp==0)
			return 1;
		//재귀및 실행
		long NewBase = power(base,exp/2);
		if(exp%2==0) {
			return NewBase*NewBase;
		}else {
			return (NewBase*NewBase)*base;
		}
	}
}
