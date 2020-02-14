import java.util.LinkedList;
import java.util.Queue;

public class MyChew {

	public static class Person{
		int idx;
		int cnt;
		
		public Person(int idx,int cnt) {
			this.idx = idx;
			this.cnt = cnt;
		}
	}
	
	static int myzzew = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Person> q = new LinkedList<>();
		
		q.offer(new Person(1,1));
		
		int count = 1;
		while(true) {
			Person temp = q.poll();
			myzzew -= temp.cnt;
			if(myzzew<=0) {
				System.out.println("idx : "+temp.idx);
				break;
			}
			temp.cnt++;
			q.offer(temp);
			q.offer(new Person(temp.idx+1,1));
		}
	}
}
