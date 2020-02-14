
public class bubble_sort {
	public static void main(String[] args) {
		int[] arr = {55, 7, 78, 12, 42};
		int tmp;
		int size;
		int size_t;
		
		size_t = arr.length-1;
		for (int i =0; i<size_t; i++) {
			size =size_t-i;
			for(int j = 0; j<size;j++) {
				if(arr[j]>arr[j+1]) {
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		//카운팅 정렬, 선택적 정렬
		for (int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
