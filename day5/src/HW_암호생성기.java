import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HW_암호생성기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] a = new int[8];
		for(int t=1;t<=10;t++) {
			int T = sc.nextInt();
			Queue<Integer> q = new LinkedList<>();
			for(int i=0;i<8;i++)
				q.offer(sc.nextInt());
			int temp;
			boolean flag = false;
			while(!flag) {
				for(int cnt=1;cnt<=5;cnt++) {
					temp = q.poll();
					temp -= cnt;
					if(temp<=0) {
						flag = true;
						q.offer(0);
						break;
					}
					q.offer(temp);
				}
			}
			Iterator<Integer> it = q.iterator();
			System.out.print("#"+T+" ");
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			System.out.println();
		}
	}
}
