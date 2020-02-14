import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Tower {

	public static class Top{
		int height;
		int idx;
		public Top(int height, int idx) {
			this.height = height;
			this.idx = idx;
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack<Top> stack = new Stack<Top>();
		stack.push(new Top(Integer.MAX_VALUE, 0));
		int h;
		for(int i=1;i<=N;i++) {
			h = sc.nextInt();
			while(!stack.isEmpty()) {
				if(stack.peek().height<h) {
					stack.pop();
				}
				else
					break;
			}
			System.out.print(stack.peek().idx+" ");
			stack.push(new Top(h, i));
		}
	}
}
