import java.util.Scanner;

public class baby_gin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[12];
		int run=0;
		int triple =0;
		int tmp;
		for (int i=0; i<6;i++) {
			tmp = sc.nextInt();
			num[tmp]++;
			if (tmp==0||tmp==1) {
				num[tmp+10]++;
			}
		}
		tmp = 0;
		while(tmp<10) {
			if(num[tmp]>=3) {
				num[tmp] = num[tmp]-3;
				triple ++;
				continue;
			}
			if(num[tmp]>=1&&num[tmp+1]>=1&&num[tmp+2]>=1) {
				//자바는 짧은 논리 연산해서 뒤가 거짓이면 앞에서 에러 발생시 문제
				num[tmp]--;
				num[tmp+1]--;
				num[tmp+2]--;
				run++;
				continue;
			}
			tmp++;
		}
		if(run+triple==2)
			System.out.println("Baby Gin");
		else
			System.out.println("lose");
		
	}

}
