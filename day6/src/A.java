import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class A {
	
	static class SS{
		int num;
		
		public SS(int num) {
			this.num = num;
		}
	}

	public static void main(String[] args) {
		ArrayList<SS> ll = new ArrayList<>();
		ll.add(new SS(1));
		ll.add(new SS(2));
		ll.add(new SS(3));
		System.out.println(ll.size());
		System.out.println(ll.remove(new SS(2)));
		System.out.println("===================");
		// A, B, C, D, E 항목 관리
		ArrayList<Character> list = new ArrayList();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		
		Character ch1 = list.remove(2);
		boolean flag = list.remove(new Character('B'));
		System.out.println(flag);
		System.out.println(ch1);

		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		LinkedList<Character> list1 = new LinkedList();
		list1.addLast('A');
		list1.addLast('B');
		list1.addLast('C');
		list1.addLast('D');
		System.out.println("```````````````");
		System.out.println(list1.remove());
		System.out.println(list1.remove());
		System.out.println(list1.remove());
		System.out.println(list1.remove());
		System.out.println(list1.isEmpty());
		System.out.println(list1.size());
		Iterator<Character> it = list1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		for(Character ch : list1) {
//			System.out.println(ch);
//		}
		
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i));
//		}
	}

}
