import java.util.Arrays;
import java.util.Random;

public class MergeSortTest {

	static int[] temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = {69,10,30,2,16,8,31,22};
		temp = new int[d.length];
		mergeSort(d,0,d.length-1);
		
		System.out.println(Arrays.toString(d));
	}
	
	static void mergeSort(int[] d,int start, int end) {
		//종료
		if(start==end)//배열의 길이가 1이면 시작과 끝의 인덱스가 같다.
			return ;
		//재귀및실행
		int mid = (start+end)/2;
		mergeSort(d,start,mid);
		mergeSort(d,mid+1,end);
		merge(d,start,end,mid);
	}
	
	static void merge(int[] d, int start, int end, int mid) {
		int left=start;
		int right=mid+1;
		int cnt = start;
		while(left<=mid&&right<=end) {
			if(d[left]<d[right]) {
				temp[cnt] = d[left];
				left++;
			}else {
				temp[cnt] = d[right];
				right++;
			}
			cnt++;
		}

		while(right<=end) {
			temp[cnt] = d[right];
			cnt++;
			right++;
		}

		while(left<=mid) {
			temp[cnt] = d[left];
			cnt++;
			left++;
		}
		
		for(int i=start;i<=end;i++) {
			d[i] = temp[i];
		}
	}

}
