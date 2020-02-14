import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class WsCardGame {

	static int aWin;
	static int aLose;

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int[] a = new int[9];
			int[] b = new int[9];
			int[] temp = new int[9];
			boolean[] cnt = new boolean[18 + 1];
			int n;
			for (int i = 0; i < 9; i++) {
				n = sc.nextInt();
				a[i] = n;
				cnt[n] = true;
			}
			int idx = 0;
			for (int i = 1; i <= 18; i++) {
				if (!cnt[i]) {
					b[idx] = i;
					idx++;
				}
			}
			aWin = 0;
			aLose = 0;
			boolean[] v = new boolean[9];
			Arrays.fill(v, false);
			method(a, b, v, temp, 0);
			System.out.println("#" + t + " " + aWin + " " + aLose);
			
		}
	}

	static void method(int[] a, int[] b, boolean[] v, int[] temp,
			int round) {
		// 종료
		if (round == 9) {
			int aSum = 0;
			int bSum = 0;
			for(int i=0;i<9;i++) {
				if(a[i]>temp[i]) {
					aSum += (aSum+bSum);
				}else {
					bSum += (aSum+bSum);
				}
			}
			if(aSum>bSum) {
				aWin++;
			}else {
				aLose++;
			}
			return;
		}

		// 실행 및 재귀
		
		for (int i = 0; i < 9; i++) {
			if (v[i])
				continue;
			temp[round] = b[i];
			v[i] = true;
			method(a, b, v,temp, round+1);
			v[i] = false;
		}
	}
}