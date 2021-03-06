import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Dice {
	static int[] arr;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int N=0,M=0;
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N+1];
		arr[0]=1;
		switch(M) {
		case 1:
			dice1(1,N);
			break;
		case 2:
			dice2(1,N);
			break;
		case 3:
			dice3(1,N);
			break;
		}
		
	}
	static void print() {
		for(int i=1;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void dice1(int idx, int N) {
		//종료
		if(N==0) {
			print();
			return;
		}
		//실행코드
		
		//재귀
		for(int i=1;i<=6;i++) {
			arr[idx] = i;
			dice1(idx+1,N-1);
		}
	}
	static void dice2(int idx, int N) {
		//종료
		if(N==0) {
			print();
			return;
		}
		//실행코드
		
		//재귀
		for(int i=arr[idx-1];i<=6;i++) {
			arr[idx] = i;
			dice2(idx+1,N-1);
		}
	}
	static void dice3(int idx, int N) {
		if(N==0) {
			print();
			return;
		}
		//실행코드
		
		//재귀
		for(int i=1;i<=6;i++) {
			arr[idx] = i;
			if(findNum(idx,i))
				continue;
			dice3(idx+1,N-1);
		}
	}
	static boolean findNum(int end, int num) {
		for(int i=1;i<end;i++){
			if(arr[i] == num)
				return true;
		}
		return false;
	}
}
