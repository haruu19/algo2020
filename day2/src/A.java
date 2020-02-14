import java.util.Scanner;

public class A {

	public static void main(String[] args) {
// 손님이 낸 돈과 비용을 입력받아 잔돈의 갯수를 출력하라
		Scanner sc = new Scanner(System.in);
		int getMoney = sc.nextInt();
		int getPay = sc.nextInt();
		int result = 0;
		int tmp = getMoney-getPay;
		
		result += tmp/50000;
		System.out.println("5만원: "+(tmp/50000));
		tmp = tmp%50000;
		result += tmp/10000;
		System.out.println("1만원: "+(tmp/10000));
		tmp = tmp%10000;

		result += tmp/5000;
		System.out.println("5천원: "+(tmp/5000));
		tmp = tmp%5000;
		result += tmp/1000;
		System.out.println("1천원: "+(tmp/1000));
		tmp = tmp%1000;
		
		
//		if(result>=50000) {
//			while(result>=50000*tmp) {
//				tmp++;
//			}
//			tmp--;
//			System.out.println("5만원: "+tmp);
//			result-=50000*tmp;
//			tmp =1;
//		}
//		if(result>=10000) {
//			while(result>=10000*tmp) {
//				tmp++;
//			}
//			tmp--;
//			System.out.println("1만원: "+tmp);
//			result-=10000*tmp;
//			tmp =1;
//		}
//		if(result>=5000) {
//			while(result>=5000*tmp) {
//				tmp++;
//			}
//			tmp--;
//			System.out.println("5천원: "+tmp);
//			result-=5000*tmp;
//			tmp =1;
//		}
//		if(result>=1000) {
//			while(result>=1000*tmp) {
//				tmp++;
//			}
//			tmp--;
//			System.out.println("1천원: "+tmp);
//			result-=1000*tmp;
//			tmp =1;
//		}
//		if(result>=500) {
//			while(result>=500*tmp) {
//				tmp++;
//			}
//			tmp--;
//			System.out.println("5백원: "+tmp);
//			result-=500*tmp;
//			tmp =1;
//		}
//		if(result>=100) {
//			while(result>=100*tmp) {
//				tmp++;
//			}
//			tmp--;
//			System.out.println("1백원: "+tmp);
//			result-=100*tmp;
//			tmp =1;
//		}
//
//		if(result>=50) {
//			while(result>=50*tmp) {
//				tmp++;
//			}
//			tmp--;
//			System.out.println("5십원: "+tmp);
//			result-=50*tmp;
//			tmp =1;
//		}
//		if(result>=10) {
//			while(result>=10*tmp) {
//				tmp++;
//			}
//			tmp--;
//			System.out.println("1십원: "+tmp);
//			result-=10*tmp;
//			tmp =1;
//		}
//		if(result == 0)
//		{
//			System.out.println("거스름돈 반환이 완료되었습니다.");
//		}
//		else
//		{System.out.println(tmp+"원은 거슬러 줄수 없습니다.");
//		}
		
	}
}
