
public class IntNum {

	public static void main(String[] args) {
		
		/* int 변수 선언 후 임의로 값을 넣음
		해당 값이 짝수이면 "짝수입니다" 출력
		해당 값이 홀수이면 "홀수입니다" 출력
		*/
		
		int num = 53;
		if ((num % 2)==0) {
			System.out.println(num + "은 짝수입니다.");
		}
			else {
				System.out.println(num + "은 홀수입니다.");
		}
	}
}

