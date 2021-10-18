import java.util.Scanner;

class Money {
	private int m_500, m_100, m_50, m_10, m_5, m_1, money, tmp;

	Money(int money) {

		setMoney(money);
	}

	public void setMoney(int money) {

		if (money < 0) {
			this.money = 0;
			System.out.println("잘못된 입력입니다");
			return;
		}

		this.money = money;

	}

	public void show() {

		m_500 = money / 50000;
		tmp = money - m_500 * 50000;

		m_100 = tmp / 10000;
		tmp = tmp - m_100 * 10000;

		m_50 = tmp / 5000;
		tmp = tmp - m_50 * 5000;

		m_10 = tmp / 1000;
		tmp = tmp - m_10 * 1000;

		m_5 = tmp / 500;
		tmp = tmp - m_5 * 500;

		m_1 = tmp / 100;
		
		System.out.println("오만원 : " + m_500 + "장");
		System.out.println("만원 : " + m_100 + "장");
		System.out.println("오천원 : " + m_50 + "장");
		System.out.println("천원 : " + m_10 + "장");
		System.out.println("오백원 : " + m_5 + "개");
		System.out.println("백원 : " + m_1 + "개");

	}

}


public class MoneyTest {

	public static void main(String[] args) {

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("금액을 입력하세요");
			
			int money = sc.nextInt();
			
			Money m = new Money(money);
			m.show();
		
			char ch = sc.next().charAt(0);
			 
	        if(ch == 'N' || ch == 'n' )
	         break;
		}
		
		System.out.println("종료입니다");
		
	}

}
