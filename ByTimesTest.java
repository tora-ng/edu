package day_10_27;

import java.util.Scanner;

public class ByTimesTest {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		// String�� ��õ�ϴ� ����: String �ȿ� ���� ������ �ٷ� �� �ִ� ���� �Լ��� �ֱ� ������ ����Ѵ�.
		String op = null;

		while (true) {

			try {

				Scanner scan = new Scanner(System.in);

				System.out.println("*** ���� ***"); // Ÿ��Ʋ ���
				System.out.print("��1 : ");
				num1 = scan.nextInt();

				System.out.print("��2 : ");
				num2 = scan.nextInt();

				System.out.print("���� : ");
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
					System.out.println("�߸��� ������ �Է��Դϴ�.");
					result = 0;
				}

				System.out.println("��� ��� : " + result);

				System.out.println("��� �Ͻðڽ��ϱ�? ��� : Y , ���� : N");
				String finish = scan.next();

				if (finish.equals("N") || finish.equals("n")) {
					break;
				}
			} catch (Exception e) {
				System.out.println("�߸��� �Է��Դϴ�. ó������ �ٽ� �Է��� �ּ���");
				continue;
			}

		} // while (true) ���α׷��� ���⼭ ���̶�� �� ǥ���� �ִ� ��쵵 ����

		System.out.println("���α׷� ���� �Դϴ�.");
	}
}