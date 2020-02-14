import java.util.Arrays;
import java.util.Comparator;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data[] arr = new Data[5];
		Data d = new Data();
		d.num = 1;
		d.jumsu = 84;
		arr[0] = d;
		d = new Data();
		d.num = 5;
		d.jumsu = 74;
		arr[1] = d;
		d = new Data();
		d.num = 3;
		d.jumsu = 45;
		arr[2] = d;
		d = new Data();
		d.num = 8;
		d.jumsu = 64;
		arr[3] = d;
		d = new Data();
		d.num = 6;
		d.jumsu = 44;
		arr[4] = d;
		
		Arrays.sort(arr);
		
//		Arrays.sort(arr, new Comparator<Data>() {
//
//			@Override
//			public int compare(Data o1, Data o2) {
//				// TODO Auto-generated method stub
//				return o1.jumsu - o2.jumsu;
//			}
//			
//		});
		
		for(Data dd :arr) {
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
