import java.util.Scanner;

public class day1_work {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int result = 0;
		int best;
		int count = 0;
		for(int i = 0; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		best = n-1;
		for(int i = n-2; i>=0;i--) {
			if(best<arr[i]) {best = arr[i];count=0;}
			else if(arr[i]==best) {count++;}
			else {}
			if(result<n-1-i-count) {result=n-1-i-count;}
			System.out.println(result);

		}
//		System.out.println(result);
	}
}
