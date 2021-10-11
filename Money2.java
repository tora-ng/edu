
public class Money2 {

	public static void main(String[] args) {
		
		//첫번째 방법
		int m_500, m_100, m_50, m_10, m_5, m_1, money, tmp;
		money = 126000;
		
		m_500 = money / 50000;
		tmp = money - ( m_500 * 50000 );
		
		m_100 = tmp / 10000;
		tmp = tmp - ( m_100 * 10000 );
		
		m_50 = tmp / 5000;
		tmp = tmp - ( m_50 * 5000 );
		
		m_10 = tmp / 1000;
		tmp = tmp - ( m_10 * 1000 );
		
		m_5 = tmp / 500;
		tmp = tmp - ( m_5 * 500 );
		
		m_1 = tmp / 100;
		tmp = tmp - ( m_1 * 100 );
		
		System.out.println("오만원: "+ m_500 + "장");
		System.out.println("만원: "+ m_100 + "장");
		System.out.println("오천원: "+ m_50 + "장");
		System.out.println("천원: "+ m_10 + "장");
		System.out.println("오백원: "+ m_5 + "장");
		System.out.println("백원: "+ m_1 + "장");
		
		//두번째 방법
		money = 126_500;
		
		System.out.println("- - - - - - - - - - ");
		System.out.println("오만원: "+ money/50000 + "장");
		money = money % 50000;
		
		System.out.println("만원: "+ money/10000 + "장");
		money = money % 10000;
		
		System.out.println("오천원: "+ money/5000 + "장");
		money = money % 5000;
		
		System.out.println("천원: "+ money/1000 + "장");
		money = money % 1000;
		
		System.out.println("오백원: "+ money/500 + "장");
		money = money % 500;
		
		System.out.println("백원: "+ money/100 + "장");
		money = money % 100;
	}

}
