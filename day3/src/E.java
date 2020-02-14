
public class E {
	//5. 문자열을 전달받아 그 문자 사이에 ,를 결합하여 반환하는 재귀함수를 만들어라
	//String s = doStringComma("korea","");
	//k,o,r,e,a
	static String doStringComma(String str, String res,int cnt) {
		if(cnt==str.length()) {
			return res;
		}
		char data = str.charAt(cnt);
		res +=data;
		if(cnt<str.length()-1)
			res +=",";
		return doStringComma(str,res,cnt+1);
	}
	public static void main(String[] args) {
		String s = doStringComma("korea","",0);
		System.out.println(s);
		// TODO Auto-generated method stub
		// 2진수 3자리를 구성할 수 있는 재귀함수를 만들어라.
		//	000
		//	001
		//	...
		//	110
		//	111
		//method("",3);
	}
	static String[] srr = {"0","1"};
	static void method(String result,int num) {
		if(num == 0) {
			System.out.println(result);
			return;
		}
		for(int i=0;i<2;i++) {
			method(result+srr[i],num-1);
		}
		//method(result+"0",num-1);
		//method(result+"1",num-1);
	}
}
