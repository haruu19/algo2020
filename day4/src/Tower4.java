import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Tower4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int N = sc.nextInt();
		
		Stack<Top> stack = new Stack<Top>();
		stack.push(new Top(Integer.MAX_VALUE,0));
		int cur_height;
		for(int i=1;i<=N;i++) {
			cur_height = sc.nextInt();
			while(!stack.isEmpty()) {
				if(stack.peek().height<cur_height) {
					stack.pop();
				}else {
					break;
				}
			}
			
			System.out.print(stack.peek().num+" ");
			stack.push(new Top(cur_height, i));
		}
	}

	static class Top{
		int height;
		int num;
		
		public Top(int height, int num) {
			this.height = height;
			this.num = num;
		}
	}
	
}
