
public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =  11;
//		00000000 00000000 00000000 00001011
//&		00000000 00000000 00000000 00000100
//		00000000 00000000 00000000 00000000
//		오른쪽에서 3번째 비트가 0인지 1인지  판단하라
//		int sss = num1 & (1<<3);
		if((num1 & (1<<3))!=0) {
			System.out.println("1");
		}else {
			System.out.println("2");
		}
		/*
		int num2 = 7;
//		00000000 00000000 00000000 00000111
		int res = num2 << (35%32);
		res = num2 << (31);
//		00000000 00000000 00000000 00001110 num2 << 1
//		00000000 00000000 00000000 00011100 num2 << 2
//		00000000 00000000 00000000 00111000 num2 << 3
//		res = num2 * 1024;
//		res = 10000 * 8;
//		res = 8 * 10000;
		System.out.println(res);
		

//		int num3 = num1 & num2;
//		int num3 = num1 | num2;
		int num3 = num1 ^ num2;
		num3 = ~num1;
		System.out.println(num3);
//		num2^=num2;
//		num2&=0;
		num1 = ~num1 + 1;//num1 의 2의 보수
		
//		-11
//		10000000 00000000 00000000 00001011  부호와 절대치
//		11111111 11111111 11111111 11110100 부호와 1의보수 
//		11111111 11111111 11111111 11110101 부호와 2의보수 
*/	}

}
