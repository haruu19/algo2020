import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
 

public class Ladder {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileReader("input.txt"));
        int TC=10;
        int nx=0,ny=0;
        int x=0,y = 0;
        int idx=0;
        int[]dx = {-1,1,0};
        int[]dy = {0,0,-1};
        for(int test_case=1;test_case<=TC;test_case++) {
            int T=sc.nextInt();
            int[][] a = new int[100][100];
            for(int i=0;i<100;i++) {
            	for(int j=0;j<100;j++) {
            		a[i][j] = sc.nextInt();
            		if(a[i][j]==2) {
            			y=i;
            			x=j;
            		}
            	}
            }
            while(true) {
            	if(y==0) {
            		idx=x;
            		break;
            	}
            	for(int k=0;k<3;k++) {
            		nx = x + dx[k];
            		ny = y + dy[k];
            		if(nx<0||nx>99)
            			continue;
            		if(a[ny][nx]==1) {
            			x=nx;
            			y=ny;
            			a[ny][nx]=2;
            			break;
            		}
            	}
            }
            System.out.println("#"+T+" "+idx);
	}
}
}
	
