import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(new FileInputStream("input.txt"));
		int TC = sc.nextInt();
	}

}
