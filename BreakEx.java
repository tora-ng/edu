
public class BreakEx {

	public static void main(String[] args) {

		/*
		 * int num = 1;
		 * 
		 * 
		 * while( (num++) < 1000 ) {
		 * 
		 * if ((num % 2 == 0) && (num % 3 == 0)) { System.out.println(num); } }
		 */

		// 1
		for (int i = 1; i <= 1000; i++) { // for문 안의 i는 for문 안에서만 유효하다.
			if ((i % 2 == 0) && (i % 3 == 0)) {
				System.out.println(i);
				break;
			}
		}

		// 2
		int j;
		for (j = 1; j <= 1000; j++) { // for문 안의 i는 for문 안에서만 유효하다.
			if ((j % 2 == 0) && (j % 3 == 0)) {
				break;
			}
		}
		System.out.println(j);
	}

}

//1과 1000 사이의 숫자 중 2의 배수이자 3의 배수인 수들 중 첫번째 수를 출력하는 프로그램
