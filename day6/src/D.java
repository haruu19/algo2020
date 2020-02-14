import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Data> list = new ArrayList<>();
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
		
		Collections.sort(list, new Comparator<Data>() {
			
			@Override
			public int compare(Data o1, Data o2) {
				// TODO Auto-generated method stub
				return o1.num - o2.num;
			}
		});
		
		
//		Arrays.sort(arr, new Comparator<Data>() {
//
//			@Override
//			public int compare(Data o1, Data o2) {
//				// TODO Auto-generated method stub
//				return o1.jumsu - o2.jumsu;
//			}
//			
//		});
		
		for(Data dd :list) {
			System.out.println("num : "+ dd.num + ", jumsu : "+dd.jumsu);
		}
		
	}
//	static class Data{
//		int num;
//		int jumsu;
//	}
	static class Data implements Comparable<Data>{
		int num;
		int jumsu;
		@Override
		public int compareTo(Data other) {
			// TODO Auto-generated method stub
			return other.jumsu - jumsu;
		}
	}
}
