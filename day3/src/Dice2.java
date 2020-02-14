import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Dice2 {
	static int[] arr;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int N=0,M=0;
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N+1];
		arr[0]=1;
		dice(1,N,M,0);
		
	}
	static void print() {
		for(int i=1;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void dice(int idx, int N, int M, int sum) {
		//종료
		if(N==0) {
			if(sum == M)
				print();
			return;
		}
		//실행코드
		
		//재귀
		for(int i=1;i<=6;i++) {
			arr[idx] = i;
			sum += i;
			dice(idx+1,N-1, M, sum);
			sum = sum - i;
		}
	}
}