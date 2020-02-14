
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "100";
		int num = Integer.parseInt(s);
		num += 3;
		System.out.println(num);
//		ch 기억의 자료가 숫자인지 아닌지 판단하라
		boolean flag = isDigit('3');
		char ch = '3';
		num = ch - 48;
		System.out.println(num);
	}

	static boolean isDigit(char ch) {
		boolean flag = false;
		if(ch >= '0'&& ch<='9')
			flag = true;
		return flag;
		
	}
}
