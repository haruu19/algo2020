import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SSQueue q = new SSQueue();
		Queue<Character> q = new LinkedList<>();
		q.offer('A');
		q.offer('B');
		q.offer('C');
//		Node temp = q.front;
//		while(temp!=null) {
//			System.out.print(temp.data+" ");
//			temp = temp.next;
//		}
		Iterator<Character> it = q.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.size());
		System.out.println("end");
	}
	
	
	static class SSQueue{
		Node front = null;
		Node rear = null;
		int size = 0;
		
		int size() {
			
			return size;
		}
		
		char peek() {
			return front.data;
		}
		
		private boolean isEmpty() {
			boolean flag = false;
			if(front==null&&rear==null)
				flag=true;
			return flag;
		}
		
		void offer(char ch) { //삽입
			Node temp = new Node();
			temp.data = ch;
			temp.next = null;
			if(isEmpty()) { // 1. 비어있으면
				front = temp;
			}else {
				rear.next = temp;
			}
			rear = temp;
			size++;
		}
		
		char poll() {
			char ch = ' ';
			if(front == null) {
				System.out.println("비어있는 큐");
				return ' ';
			}
			Node old = front;
			ch = front.data;
			front = front.next;
			if(front == null)
				rear = null;
			size--;
			return ch;
		}
		
	}
	static class Node{
		char data;
		Node next;
	}
}
