
public class Money2 {

	public static void main(String[] args) {
		
		//ù��° ���
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
		
		System.out.println("������: "+ m_500 + "��");
		System.out.println("����: "+ m_100 + "��");
		System.out.println("��õ��: "+ m_50 + "��");
		System.out.println("õ��: "+ m_10 + "��");
		System.out.println("�����: "+ m_5 + "��");
		System.out.println("���: "+ m_1 + "��");
		
		//�ι�° ���
		money = 126_500;
		
		System.out.println("- - - - - - - - - - ");
		System.out.println("������: "+ money/50000 + "��");
		money = money % 50000;
		
		System.out.println("����: "+ money/10000 + "��");
		money = money % 10000;
		
		System.out.println("��õ��: "+ money/5000 + "��");
		money = money % 5000;
		
		System.out.println("õ��: "+ money/1000 + "��");
		money = money % 1000;
		
		System.out.println("�����: "+ money/500 + "��");
		money = money % 500;
		
		System.out.println("���: "+ money/100 + "��");
		money = money % 100;
	}

}
