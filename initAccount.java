class BankAccount3 {
	String accNumber;
	String ssNumber;
	int balance = 0;
	
public void initAccount(String acc, String ss, int bal) {
	//�ʱ�ȭ�� ���� �޼ҵ�
	accNumber = acc;
	ssNumber = ss;
	balance = bal;
}
	public static void main(String[] args) {
		BankAccount3 yoon = new BankAccount3();
		yoon.initAccount("12-34-59", "990999-9999999", 10000);

	}

}
