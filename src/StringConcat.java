
public class StringConcat {

	public static void main(String[] args) {
		String st1 = "Coffee";
		String st2 = "Bread";

		String st3 = st1.concat(st2);
		System.out.println(st3);

		String st4 = "Fresh".concat(st2); //"Fresh" 자체를 문자열로 잡는다. 리터럴임
		System.out.println(st4);
		
		String st5 = "abcdefg";
		
		//인덱스 2 이후의 내용으로 이뤄진 문자열 "cdefg" 반환
		String st6 = st5.substring(2);
		System.out.println(st6);
		
		//인덱스 2 ~ 3에 위치한 내용의 문자열 반환
		String st7 = st5.substring(2, 4);
		System.out.println(st7);
		
	}

}
