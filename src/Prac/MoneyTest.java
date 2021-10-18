package Prac;

import java.util.Scanner;

class Money {
	private int money = 0;

	Money(int money) {
		setMoney(money);
	}

	public void setMoney(int money) {
		if (money < 0) {
			this.money = 0;
			System.out.println("잘못된 값입니다.");
			return;
		}

	}

	public void show() {
		System.out.println("오만원 : " + money / 50000 + "장");
		money = money % 50000;

		System.out.println("만원 : " + money / 10000 + "장");
		money = money % 10000;

		System.out.println("오천원 : " + money / 5000 + "장");
		money = money % 5000;

		System.out.println("천원 : " + money / 1000 + "장");
		money = money % 1000;

		System.out.println("오백원 : " + money / 500 + "개");
		money = money % 500;

		System.out.println("백원 : " + money / 100 + "개");
	}
}

public class MoneyTest {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("금액을 입력하세요.");
			int money = sc.nextInt();

			Money m = new Money(money); // 객체생성

			m.show();
			char ch = sc.next().charAt(0);
			
			System.out.println("계속 Y :: 중단 N");
			char ch1 = sc.next().charAt(0);

			if (ch1 == 'N' || ch1 == 'n')
				break;
		}
	}

}