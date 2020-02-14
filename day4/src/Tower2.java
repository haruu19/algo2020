import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Tower2 {
	
	public static class Top{
		int height;
		int num;
		
		Top(int height, int num){
			this.height = height;
			this.num = num;
		}
	}
	static int N;
	static int[] a;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		N = sc.nextInt();
		
		Stack<Top> stack = new Stack<Top>();
		stack.push(new Top(Integer.MAX_VALUE,0));
		
		int inp;
		for(int i=1;i<=N;i++) {
			inp=sc.nextInt();
			
			while(!stack.isEmpty()) {
				if(stack.peek().height <= inp)stack.pop();
				else break;
			}
			
			System.out.print(stack.peek().num+" ");
			stack.push(new Top(inp, i));
		}
	}
	
}

