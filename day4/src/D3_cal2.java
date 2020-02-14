import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class D3_cal2 {
	static int L;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		for(int i=1;i<=10;i++) {
			L = sc.nextInt();
			String str = sc.next();
			String postOrder = doPostOrder(str);
//			System.out.println(postOrder);
			
			int result = doCalc(postOrder);
			System.out.println("#"+i+" "+result);
		}
	}
	
	static int doCalc(String s) {
		int n1,n2,n3;
		Stack<Integer> stack = new Stack<Integer>();
		char[] crr = s.toCharArray();
		for(char ch : crr) {
//			Character.isDigit(ch)
			if(ch>='0'&&ch<='9') {
//				stack.push(Integer.parseInt(ch+""));
				stack.push(ch-'0');
			}else {
				n2 = stack.pop();
				n1 = stack.pop();
				n3 = calc(ch,n1,n2);
				stack.push(n3);
			}
		}
		return stack.pop();
	}
	
	static int calc(char op, int n1, int n2) {
		int result=0;
		switch(op) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
		}
		return result;
	}
	
	static int getPriority(char ch) {
		int result = 0;
		switch(ch) {
		case '+':
			result = 1;
			break;
		case '*':
			result = 2;
			break;
		}
		return result;
	}
	
	static String doPostOrder(String s) {
		String result = "";
		char[] crr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(char ch : crr) {
			if(ch>='0' && ch<='9') {
				result+=ch;
			}else {
				while(!stack.isEmpty()) {
					if(getPriority(ch) <= getPriority(stack.peek())) {
						result += stack.pop();
					}else {
						break;
					}
				}
				stack.push(ch);
			}
		}
		while(!stack.isEmpty()) {
			result += stack.pop();
		}
		return result;
	}

}
