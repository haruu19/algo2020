
public class CountSort {
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8,1};
		int[] brr = new int[arr.length];
		int[] counts = new int[10+1];
		
		for (int i = 0; i < arr.length;i++) {
			counts[arr[i]]++;
		}
		for (int i = 0; i<counts.length; i++) {
			counts[i] = counts[i] + counts[i-1];
		}
		for (int i = arr.length-1; i>=0; i--) {
			brr[counts[arr[i]]-1] = arr[i];
			counts[arr[i]]--;
		}
		arr= brr;
		for(int i=0; i<arr.length; i++) {
			arr[i] = brr[i];
		}
		for (int su : arr) {
			System.out.println(su);
		}
		
	}
}
