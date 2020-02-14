import java.util.Random;
import java.util.Random;

public class InsertionSort {

	static void Isort(int[] d) {
		int num = 0;
		int j = 0;
		for(int i=1;i<d.length;i++) {
			num = d[i];
			for(j= i-1;j>=0;j--) {
				if(num>=d[j]) {
					break;
				}
				d[j+1] = d[j];
			}
			d[j+1]=num;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[10];
		Random r = new Random();
		for(int i=0;i<10;i++) {
			data[i] = r.nextInt(10)+1;
		}
		for(int i=0;i<10;i++)
			System.out.print(data[i]+" ");
		Isort(data);
		System.out.println();
		for(int i=0;i<10;i++)
			System.out.print(data[i]+" ");
	}
}
