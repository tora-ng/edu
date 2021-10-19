public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder stbuf = new StringBuilder("123");
		
		//12345678
		stbuf.append(45678); //문자열 덧붙이기
		System.out.println(stbuf.toString());
		
		//345678
		stbuf.delete(0, 2); //문자열 일부 삭제
		System.out.println(stbuf.toString());
		
		//AB678
		stbuf.replace(0, 3, "AB"); //문자열 일부 교체
		System.out.println(stbuf.toString());
		
		//876BA
		stbuf.reverse(); //문자열 내용 뒤집기
		System.out.println(stbuf.toString());
		
		//
		String sub = stbuf.substring(2, 4); //일부만 문자열 반환
		System.out.println(sub);
	}

}
