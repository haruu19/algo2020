import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Sline =new int[10000];
		int Find2=0;
		
		for(int i=0;i<1;i++) {
			int test_num = sc.nextInt();
			for(int j=0; j<10000;j++)
			{
				Sline[j] = sc.nextInt();
			}
			for (int j= 0 ; j<100; j++) {
				if(Sline[9900+j]==2)
					Find2=9900+j;
			}
			Find2-=100;
			while(Find2/100!=0) {
				if(Find2%100 != 0 && (Find2%100) - 1 == 1)
//					while
				Find2-=100;
			}
			for(int j =0; j<10000;j++) {
				System.out.print(Sline[j]);
				if(j%100==99)
				System.out.println();
			}
			System.out.println(Find2);
			
		}
		

	}

}
