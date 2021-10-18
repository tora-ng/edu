
public class StringTest {
	
	// static 함수 안에 인스턴스 변수가 오지 못하는 이유는 메모리 생성에 시간차ㅏ가 있어서이다.
	public static void showString(String str) {
		System.out.println(str);
		System.out.println(str.length());
	}

	// 함수 오버 로딩 = 우리가 쓰는 가장 대표적인 것: println

	public static void main(String[] args) {
		String str1 = new String("Simple String");
		String str2 = "The Best String";

		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println();

		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println();

		showString("Funny String");

	}

}
