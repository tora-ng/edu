package class_10_27;

public class TryCatchTest {

	public static void main(String[] args) {
		try {
			System.out.println("0 나누기 전");
			System.out.println(1 / 0);
			System.out.println("0 나누기 후"); //안 나옴
			
		} catch (Exception e) { //catch 함수
			System.out.println("Hi~"); // 얘는 실행함
			// e.printStackTrace();
		}
		System.out.println("good bye~");
	}

}

// CPU에서 연산을 한 다음, JVM으로 보낸다. 그래서 JVM에서 에러를 캐치한다.
// 캐치가 없으면 문제가 생긴(예외) 부분에서 바로 끊어지며 실시간 에러가 뜬다.
