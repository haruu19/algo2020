import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Coexist {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileReader("input.txt"));
		int tc,N,M;
		tc = sc.nextInt();
		for(int t=0;t<tc;t++) {
			int res=0,a_cnt=0,b_cnt=0;
			String[] a = new String[100000];
			String[] b = new String[100000];
			N = sc.nextInt();
			M = sc.nextInt();
			for(int i=0;i<N;i++) { 
				a[i] = sc.next();
				a_cnt++;
			}
			for(int i=0;i<M;i++) {
				b[i] = sc.next();
				b_cnt++;
			}
			Arrays.sort(a);
			Arrays.sort(b);
			for(int i=9;i<a_cnt;i++) {
				if(binarySearch(a[i],b))
					res++;
			}
			System.out.println("#"+(t+1)+" "+res);
		}
	}
}
