import java.util.Arrays;

public class SelectionSortTest {

	public static void main(String[] args) {
		int[] arr = {5,8,3,7,9,1};
		int minIdx;
		int temp;
		for(int i = 0; i<arr.length -1;i++) {
			minIdx = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIdx])
					minIdx = j;
			}
			if(minIdx!=i) {
				temp = arr[i];
				arr[i] = arr[minIdx];
				arr[minIdx]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
