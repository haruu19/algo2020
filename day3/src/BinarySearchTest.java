import java.util.Arrays;

public class BinarySearchTest {

	public static void main(String[] args) {
		int[] arr = {4,5,8,9,1,3,7,6};
		int key = 9;
		int idx = -1;
		Arrays.sort(arr);
		idx=methodA(arr,key);
		idx=methodB(arr,key,0,arr.length-1);
		System.out.println(idx);
	}
	
	static int methodB(int[] arr, int key, int start, int end) {
//		종료
		if(start>end) {
			return -1;
		}
//		실행 및 재귀호출
		int middle = (start+end)/2;
		if(arr[middle]==key)
			return middle;
		else if(arr[middle]>key)
			 return methodB(arr,key,start,middle-1);
		else
			 return methodB(arr,key,middle+1,end);

	}
	
	static int methodA(int[] arr, int key) {
		int idx = -1;
		int start = 0;
		int end = arr.length-1;
		int middle;
		while(start <= end) {
			middle = (start + end)/2;
			if(arr[middle]==key) {
				return middle;
//				idx = middle;
//				break;
			}else if(arr[middle]>key) {
				end = middle-1;
			}else {
				start = middle+1;
			}
		}
		
		return idx;
	}
}
