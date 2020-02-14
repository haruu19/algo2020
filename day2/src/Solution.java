import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String StrTmp;
		char[][] arr;
		int sizeM=0;
		for(int i = 0; i<T;i++) {
			arr = new char[5][15];
			for(int j=0;j<5;j++) {
				StrTmp=sc.next();
				for(int k=0; k<StrTmp.length();k++) {
					arr[j][k]=StrTmp.charAt(k);
//					System.out.print(arr[j][k]);
				}
//				System.out.println();
				sizeM = Math.max(sizeM, StrTmp.length());
			}
			StrTmp="";
			for(int j=0;j<sizeM;j++) {
				for(int k=0;k<5;k++) {
					if(arr[k][j] >='A'&&arr[k][j]<='Z' || arr[k][j] >='a'&&arr[k][j]<='z'||arr[k][j] >='0'&&arr[k][j]<='9')
						if(arr[k][j]!= '\u0000')
							StrTmp+=arr[k][j];
				}
			}
			System.out.println("#"+ (i+1) + " " + StrTmp);
		}
		
	}
}
