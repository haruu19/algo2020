import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class E {

	public static void main(String[] args) {
		// 4,7,2,3
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
			
		});
		
		pq.add(4);
		pq.add(7);
		pq.add(2);
		pq.add(3);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		pq.add(1);
		System.out.println(pq.poll());
		
		PriorityQueue<Data> list = new PriorityQueue<Data>();
		Data d = new Data();
		d.num = 1;
		d.jumsu = 84;
		list.add(d);
		d = new Data();
		d.num = 5;
		d.jumsu = 74;
		list.add(d);
		d = new Data();
		d.num = 3;
		d.jumsu = 45;
		list.add(d);
		d = new Data();
		d.num = 8;
		d.jumsu = 64;
		list.add(d);
		d = new Data();
		d.num = 6;
		d.jumsu = 44;
		list.add(d);
		
		while(!list.isEmpty()) {
//			System.out.println(list.poll().toString());
		}
		
//		
//		Collections.sort(list, new Comparator<Data>() {
//			
//			@Override
//			public int compare(Data o1, Data o2) {
//				// TODO Auto-generated method stub
//				return o1.num - o2.num;
//			}
//		});
		
		
//		Arrays.sort(arr, new Comparator<Data>() {
//
//			@Override
//			public int compare(Data o1, Data o2) {
//				// TODO Auto-generated method stub
//				return o1.jumsu - o2.jumsu;
//			}
//			
//		});
		
//		for(Data dd :list) {
//			System.out.println("num : "+ dd.num + ", jumsu : "+dd.jumsu);
//		}
//		
//	}
//	static class Data{
//		int num;
//		int jumsu;
//	}
	}
	static class Data implements Comparable<Data>{
		int num;
		int jumsu;
		@Override
		public int compareTo(Data other) {
			// TODO Auto-generated method stub
			return other.jumsu - jumsu;
		}
		public String toString() {
			return num+" "+jumsu;
		}
	}
}
