
public class ImmutableString {
	
	//원본 보전(Immutable)
	
	public static void main(String[] args) {
		String str1 = "Simple Sting";
		String str2 = "Simple Sting";
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		String str5 = str1 + str2; //두 개 더한 값의 메모리가 어디에 저장될지?
		System.out.println(str5);
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		} else {
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		}
		
		if(str3 == str4) {
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		} else {
			System.out.println("str3과 str4는 다른 인스턴스 참조");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 같은 글자입니다");
		} else {
			System.out.println("str3과 str4는 다른 글자입니다");
		}


	}

}
