
public class F {
	static long[] dp = new long[100];
	public static void main(String[] args) {
		// 피보나치 Memoization
		int num = 80;
		dp[0] = 0;
		dp[1] = 1;
		long result = fibo(num);
		System.out.println(result);
	}
//	static long fibo(int num) { // 얘는 memoization이다.
//		if(num==0) {
//			return 0;
//		}
//		if(num==1) {
//			return 1;
//		}
//		if(dp[num] == 0) { // dp배열에 값이 없으면 실행한적이 없으므로 재귀 실행.
//			dp[num] = fibo(num-1) + fibo(num-2);
//		}
//		return dp[num]; // 있으면 그냥 리턴. 재귀 실행 안해서 실행속도가 빨라진다.
//	}
	
	static long fibo(int num) { // 얘가 DP다.
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2;i<=num;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[num];
	}
}
