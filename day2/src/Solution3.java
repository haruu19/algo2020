import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);
        for (int t = 0; t < 10; t++) {
            int tn = sc.nextInt();
            int mat[][] = new int[100][100];
            for (int y = 0; y < 100; y++) {
                for (int x = 0; x < 100; x++) {
                    mat[y][x] = sc.nextInt();
                }
            }
 
            /* 도착지점 X 인덱스 찾기 */
            int arrivalX = -1;
            for (int x = 0; x < 100; x++) {
                if (mat[99][x] == 2) {
                    arrivalX = x;
                    break;
                }
            }
 
            /* 사다리 타기 */
            int x = arrivalX, y = 98;
            while (y > 0) {
                if (isInBound(100, 100, y, x - 1) && mat[y][x - 1] == 1) {
                    // 왼쪽으로 이동
                    while (isInBound(100, 100, y, x - 1) && mat[y][x - 1] == 1) {
                        x--;
                    }
                } else if (isInBound(100, 100, y, x + 1) && mat[y][x + 1] == 1) {
                    // 오른쪽으로 이동
                    while (isInBound(100, 100, y, x + 1) && mat[y][x + 1] == 1) {
                        x++;
                    }
                }
                // 위로 한칸 전진
                y--;
            }
 
            System.out.println("#" + tn + " " + x);
        }
    }
 
    public static boolean isInBound(int r, int c, int y, int x) {
        return y >= 0 && x >= 0 && y < r && x < c;
    }
}
