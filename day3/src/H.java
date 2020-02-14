import java.util.Arrays;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "korea japan java";
		//s = "홍길동";
		int len = s.length();
		System.out.println(len);
//		s = s.replace('a', 'z');
		s = s.replace("korea", "한국");
		String[] srr = s.split("");
		for(String sss : srr) {
			System.out.println(sss);
		}
		char[] crr = s.toCharArray();
		for(char ch : crr) {
			System.out.println(ch);
		}
		s=s.toUpperCase();
		s = "java algo db algo web";
		
//		int idx=s.indexOf("algo");
//		int idx=s.indexOf("algo",6);
		int idx = s.lastIndexOf("algo");
		System.out.println(idx);
//		s = s.substring(5,9);
//		System.out.println(s);
		
		/*String my=getName(3);
		String you=null;
		if(my.equals(you)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}*/
		System.out.println(s.charAt(2));
	}

}
