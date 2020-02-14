
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SQueue q = new SQueue();
		q.createQueue();
		q.offer('A');
		q.offer('B');
		q.offer('C');
		q.offer('D');
		q.poll();
		q.poll();
		q.poll();
		q.poll();
		q.offer('E');
		//		q.offer('A');
//		q.offer('B');
//		q.offer('C');
//		System.out.println("size : "+ q.size());
//		char ch = q.poll();
//		System.out.println(ch);
//		System.out.println(q.peek());
//		System.out.println("size : "+ q.size());
//		q.offer('D');
//		System.out.println("size : "+ q.size());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
		System.out.println("end");
//		Queue<int> qq = new Queue<int>;
	}
	static class SQueue{
		int front;
		int rear;
		int MAX =4;
		char[] datas = new char[10];
		

		void createQueue() {
			front = rear = -1;
		}
		boolean isFull() {
			boolean flag = false;
			if(rear==MAX-1) {
				flag = true;
			};
			return flag;
		}
		void offer(char ch) {
			if(isFull()) {
				System.out.println("q overflow");
				return;
			}
			rear++;
			datas[rear] = ch;
		}
		boolean isEmpty() {
			boolean flag = false;
			if(rear==front) {
				flag = true;
			};
			return flag;
		}
		char poll() {
			char ch = ' ';
			if(isEmpty()) {
				return ch;
			}
//			return datas[++front];
			front++;
			ch = datas[front];
			if(front==rear) {
				front = rear = -1;
			}
			return ch;
		}
		char peek() {
			if(isEmpty()) {
				return ' ';
			}
			return datas[front+1];
		}
		int size() {
			return rear - front;
		}
	}
}
