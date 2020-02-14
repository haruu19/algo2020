
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. 팩토리얼
		//5!	5 * 4 * 3 * 2 * 1
		int N = 11;
		int result = fact(N);
		System.out.println(result);
	}
	static int fact(int num) {
		//종료조건
		if(num == 0) {
			return 1;
		}
		//실행
		
		//재귀호출
		//int res = num * fact(num-1);
		return num * fact(num-1);
	}

}
