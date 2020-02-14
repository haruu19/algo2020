import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class D4_cal3 {
	static int L;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		for(int i=1;i<=10;i++) {
			L = sc.nextInt();
			String str = sc.next();
			String postOrder = doPostOrder(str);
			System.out.println(postOrder);
			int result = doCalc(postOrder);
			System.out.println("#"+i+" "+result);
		}
	}
	static int Calc(char op, int n1, int n2) {
		int result = 0;
		switch(op) {
		case '+':
			result = n1+n2;
			break;
		case '*':
			result = n1*n2;
			break;
		}
		return result;
	}
	
	static int doCalc(String s) {
		int result =0;
		char[] crr = s.toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		for(char ch : crr) {
			if(ch>='0'&&ch<='9') {
				stack.push(ch-'0');
			}else {
				int n2 = stack.pop();
				int n1 = stack.pop();
				int n3 = Calc(ch,n1,n2);
				result+=n3;
				stack.push(n3);
			}
		}
		return stack.pop();
	}
	
	static int getPriority(char op) {
		int result=0;
		switch(op) {
		case '+': case '-':
			result = 1;
			break;
		case '*': case '/':
			result = 2;
			break;
		}
		return result;
	}

	static String doPostOrder(String s) {
		String result = "";
		Stack<Character> stack = new Stack<Character>();
		char[] crr = s.toCharArray();
		for(char ch : crr) {
			if(ch=='(') {
				stack.push(ch);
			}else if(ch>='0'&&ch<='9') {
				result+=ch;
			}else if(ch==')') {
				char temp;
				while(!stack.isEmpty()) {
					temp=stack.pop();
					if(temp=='(')
						break;
					result+=temp;
				}
			}else {
				while(!stack.isEmpty()) {
					if(getPriority(ch)<=getPriority(stack.peek())) {
						result+=stack.pop();
					}else {
						break;
					}
				}
				stack.push(ch);
			}
		}
		while(!stack.isEmpty()) {
			result+=stack.pop();
		}
		return result;
	}
	

}
