
public class C {

	public static void main(String[] args) {
//	1	4	7
//	2	5	8
//	3	6	9
		int[][] arr =new int[3][4];
		int cnt =1;
		for(int i = 0; i< arr.length; i++) {
			for(int j=0; j< arr[i].length; j++) {
				arr[i][j] =cnt;
				cnt++;
				
			}
		}
		for(int i = 0; i< arr.length; i++) {
			for(int j=0; j< arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");		
			}
			System.out.println();
		}
		cnt=1;
		arr = new int[4][4];
		int[][] brr= new int[4][4];
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j< arr[i].length; j++) {
				arr[i][j]= cnt;
				cnt++;
			}	
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j< arr[i].length; j++) {
				brr[i][j] = arr[3-i][3-j];
			}	
		}
		
		for(int i=0; i<brr.length;i++) {
			for(int j=0; j< brr[i].length; j++) {
				System.out.print(brr[i][j]+" ");		
			}
			System.out.println();
		}
	}
}

// 	1	2	3	4
//	5	6	7	8	
//	9	10	11	12
//	12	14	15	16