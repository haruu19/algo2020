import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class D3_Zero {
	static int K,t;
	static int[] a;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int TC = sc.nextInt();
		for(t=1;t<=TC;t++) {
			K = sc.nextInt();
			a = new int[K];
			for(int i=0;i<K;i++)
				a[i] = sc.nextInt();
			method();
		}
	}

	static void method() {
		Stack<Integer> st = new Stack<Integer>();
		int sum = 0;
		for(int i : a) {
			if(i==0) {
				st.pop();
				continue;
			}
			st.push(i);
		}
		while(!st.isEmpty())
			sum+=st.pop();
		System.out.println("#"+t+" "+sum);
	}
}
