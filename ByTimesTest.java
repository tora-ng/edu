package day_10_27;

import java.util.Scanner;

public class ByTimesTest {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		// String을 추천하는 이유: String 안에 여러 구문을 다룰 수 있는 많은 함수가 있기 때문에 사용한다.
		String op = null;

		while (true) {

			try {

				Scanner scan = new Scanner(System.in);

				System.out.println("*** 계산기 ***"); // 타이틀 출력
				System.out.print("수1 : ");
				num1 = scan.nextInt();

				System.out.print("수2 : ");
				num2 = scan.nextInt();

				System.out.print("연산 : ");
				op = scan.next();

				switch (op) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;

				default:
					System.out.println("잘못된 연산자 입력입니다.");
					result = 0;
				}

				System.out.println("계산 결과 : " + result);

				System.out.println("계속 하시겠습니까? 계속 : Y , 종료 : N");
				String finish = scan.next();

				if (finish.equals("N") || finish.equals("n")) {
					break;
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다. 처음부터 다시 입력해 주세요");
				continue;
			}

		} // while (true) 프로그램이 여기서 끝이라는 걸 표시해 주는 경우도 있음

		System.out.println("프로그램 종료 입니다.");
	}
}