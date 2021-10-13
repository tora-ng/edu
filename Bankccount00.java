class BankAccount {
	
	//char ch = 'A'; //��� ���ڸ� ����ϰ� String�� ���ڿ��� ����Ѵ�.
	// char =/= String
	// char�� '', String�� ""�� ǥ���Ѵ�.
	// String �ȿ��� �Լ��� ��û ����!!
	
	String name = "�ٵ���"; //������. ��� ���������� getter setter �Լ� �����

	int balance = 0;
	String accNumber;
	String ssNumber;

	BankAccount(String acc, String ss, int bal) {
		//������ !! �긦 ������� ������ ����Ʈ �����ڸ� ������ �ʴ´�.
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public void initAccount(String acc, String ss, int bal) {
		//�ʱ�ȭ�� ���� �޼ҵ�
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public String getName() { //Ÿ���� String Ÿ���̶� String �� ��
		return name;
	}
	//Strint�� ������
	
	public void setName(String name) {
		this.name = name; //this.�� Ŭ���� �ȿ� �ִ� �� �Ķ���Ͱ� �ƴϰ� �������̶�� �� �˷� �ִ� ���̴�.
	}
	
	public int deposit(int amount) {
		balance += amount;
		//System.out.println(balance);
		return balance; //void�� ����ص� �������� int�� ����� return ���� ���� ������ ������ �� �ٷ� Ȯ���ϰ� ������ �ٷ� Ȯ���϶�� int�� �����.
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("�ܾ� : " + balance);
		System.out.println("�ֹι�ȣ : " + accNumber);
		System.out.println("���¹�ȣ : " + ssNumber);
		return balance;
	}
	
}
// class �κ��� class ������ ���� ���� �ִ� �� ������!! ������ class �� ���� ���� �� ����


public class Bankccount00 {
	
	public static void printNum(int num) {
		System.out.println(num);
	}
	public static void printBank(BankAccount acc) { // printBank( )�� ��ȣ �ȿ� �������� �� �� �ִ�.
		acc.checkMyBalance();		
	}
	public static void main(String[] args) {
		// ������(Constructor): ���� ���� �� �ƴѵ� ���
		BankAccount yoon = new BankAccount("12-34-56", "999999-999999", 10000); //��ü 1 < BankAccount(String acc, String ss, int bal) �� ������ ��ü �������ڸ��� ��


		BankAccount park = new BankAccount("12-34-56", "999999-999999", 10000); //��ü 2

		//BankAccount choi = new BankAccount(); //�̰� �� �Ǵ� ������, �����ڰ� �����ڸ� �ϳ��� ��������� ����Ʈ �����ڸ� ���� �ʴ´�. 
		
		yoon.setName("������");
		park.setName("�ڹڹ�");
		
		System.out.println(yoon.getName());
		System.out.println(park.getName());
		
		
		// yoon = null;
		// ���� �� -> ����Ű�� �ּ� ���� - ���踦 ���´�.  
		// JVM���� �ش� �޸𸮰� ���� ������� �˷��ִ� ��.
		// �޸𸮿� �ִ� �� ���� �� ������ �ش�. C���� ����Ʈ�� ��
		
		//�� �ν��Ͻ��� ������� ������ ����
		
		if (yoon == null) {
			yoon = new BankAccount("12-34-56", "999999-999999", 10000);
		} else {
			yoon.deposit(5000);
		}
		//null ���� �� ���� ���� ��� ��� null check�� �θ�

		//yoon.deposit(5000);
		park.deposit(3000);
		
		//�� �ν��Ͻ��� ������� ����� ����
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		//�� �ν��Ͻ��� ������� �ܾ��� ��ȸ
		yoon.checkMyBalance();
		park.checkMyBalance();
		
		printBank(yoon);
		System.out.println(yoon);
		
	}

}

//public class BankAccount {
//    
//
//	int balance = 0;     // ���� �ܾ�
//
//
//	public int deposit(int amount) {
//        balance += amount;
//        return balance;
//    }    
//
//    public int withdraw(int amount) {
//        balance -= amount;
//        return balance;
//    }
//
//    public int checkMyBalance() {
//        System.out.println("�ܾ� : " + balance);
//        return balance;
//    }
//}

