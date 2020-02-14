import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		String first;
		int sum;
		
		for(int i = 1; i<=TC;i++) {
			sum=0;
			first = sc.next();
			if(first.charAt(0)=='1') {sum++;}
			for(int j = 1; j<first.length();j++) {
				if(first.charAt(j)!=first.charAt(j-1)) {
					sum++;					
				}
			}
			System.out.println("#"+i+" "+sum);
		}
	}
}