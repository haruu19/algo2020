import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// 문자열을 읽어들여서 그 문자열을 역으로 출력해보라.
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s);
		method(s);
//		char[] charr = s.toCharArray();
//		int size = charr.length/2;
//		int last = charr.length - 1;
//		char temp;
//		for(int i=0;i<size;i++) {
//			temp = charr[i];
//			charr[i] = charr[last-i];
//			charr[last-i] = temp;
//		}
//		수행
//		s = new String(charr);
//		StringBuilder sb = new StringBuilder();
//		sb.append(s);
//		sb.reverse();
//		s = sb.toString();
//		s=sb.append(s).reverse().toString();
		System.out.println(s);
//		for(int i=0;i<charr.length;i++) {
//			System.out.print(charr[i]);
//		}
	
	}
	static void method(String s) {
		char[] charr = s.toCharArray();
		int size = charr.length/2;
		int last = charr.length - 1;
		char temp;
		for(int i=0;i<size;i++) {
			temp = charr[i];
			charr[i] = charr[last-i];
			charr[last-i] = temp;	
//			s=new String(charr);
			System.out.println(s);
		}
	}	
}
