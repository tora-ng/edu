package class_10_29_Ex;
public class EqualsTest2 {

	public static void main(String[] args) {
		String str1 = new String("So Simple");
		String str2 = new String("So Simple");
		
		if(str1 == str2) {
			System.out.println("str1, str2 참조 대상 동일하다.");
		} else {
			System.out.println("str1, str2 참조 대상 다르다.");
		}
		if(str1.equals(str2)) {
			System.out.println("str1, str2 참조 대상 동일하다.");
		} else {
			System.out.println("str1, str2 참조 대상 다르다.");
		}

	}

}
//String은 내부에서 오버라이딩을 해 준다.
