import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Gwalho {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		String str = sc.next();
		char[] crr = str.toCharArray();
		SStack s = new SStack();
		boolean flag = Check(crr.length,crr,s);
		System.out.println(flag);
	}
	static boolean Check(int size, char[] crr,SStack s) {
		int i=0;
		char prev;
		char ch;
		while(i<size) {
			ch = crr[i];
			i++;
			if(ch=='['||ch=='('||ch=='{') {
				s.push(ch);
			}
			else if(ch==']'||ch==')'||ch=='}') {
				if(s.isEmpty())
					return false;
				prev = s.pop();
				if((ch==']'&&prev!='[')||(ch==')'&&prev!='('||(ch=='}'&&prev!='{'))) {
					return false;
				}
			}
		}
		if(!s.isEmpty())
			return false;
		return true;
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
