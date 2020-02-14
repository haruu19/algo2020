import java.util.Stack;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SStack s = new SStack();
		Stack<Character> s = new Stack<Character>();
//		s.create(10);
		s.push('A');
		s.push('B');
		s.push('C');
		System.out.println(s.size());
	}
	static class SStack{
		char[] datas;
		int MAX;
		int top = -1;
		
		void create(int size) {
				datas = new char[size];
				MAX = size;
		}
		int size() {
			return top+1;
		}
		void push(char data) {
			if(isFull()) {
				System.out.println("overflow");
				return;
			}
			top++;
			datas[top] = data;
		}
		boolean isEmpty() {
			boolean flag = false;
			if(top==-1)
				flag = true;
			return flag;
		}
		boolean isFull() {
			boolean flag = false;
			if(top==MAX-1)
				flag = true;
			return flag;
		}
		char pop() {
			if(isEmpty()) {
				System.out.println("overflow");
				return '\u0000';
			}
			char data = datas[top];
			top--;
			return data;

		}
		char peek() {
			if(isEmpty()) {
				System.out.println("overflow");
				return '\u0000';
			}
			char data = datas[top];
			return data;
			
		}
	}
}
class Sstack{
	
}