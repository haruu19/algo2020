import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class B {

	public static void main(String[] args) {
		int[][] arr1 = {
				{1,3},
				{5,2},
				{7,8},
				{9,4},
				{3,1}
		};
		
		Arrays.sort(arr1, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o2[1] - o1[1];
			}

		});
		
		System.out.println(Arrays.deepToString(arr1));
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		
//		Integer[] arr = {2,16,31,2,16,8,31,22};
//		Arrays.sort(arr, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o1 - o2;
//			}
//		});
////	입력된 데이터 중에 오름차순으로 정렬한 경우 앞에서 5번째 내용을 출력하라.
//		Arrays.sort(arr,Comparator.reverseOrder());
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[4]);
	}

}
