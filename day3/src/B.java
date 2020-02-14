
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 10까지 출력하라
		/*for(int i=1;i<=10;i++) {
			System.out.println(i);
		}*/
		int num=1;
		int N = 10;
		//methodA(num,N);//추가로 값이 필요하면 인자로 그때그때 전달받는다.
		//methodB(N);
		//2. 1부터 10까지 합을 출력하는 재귀함수
		//int sum = doSum(N,1);
		int sum = doSum(N);
		System.out.println(sum);
	}
	static int doSum(int num) {
		if(num==1)
			return 1;
		return num+ doSum(num-1);
		//10+(9+(8+(...+(2+(1)))))
	}
	
/*	static int doSum(int end, int num) {
		//1 종료조건
		if(num>=end) {
			return num;
		}
		//2 실행내용
		//int sum = 0;
		//sum = num + sum;
		//3 재귀호출
		//num = num+1;
		//num++;
		///int sum1=doSum(end,num+1,sum);
		return doSum(end,num+1) + num;
	}*/
	
	
	static void methodB(int N) {
		if(N<1)
			return;
		System.out.println(N);
		//N = N - 1;
		methodB(N - 1);
	}
	
	static void methodA(int num, int N){
		if(num>10)//종료조건
			return;
		System.out.println(num); //실행내용
		num++;
		methodA(num, N);//자기자신호출
	}
}
