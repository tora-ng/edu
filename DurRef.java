class BankAccount1 {
	int balance = 0;
	
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
		return balance;
	}
	
}
// class �κ��� class ������ ���� ���� �ִ� �� ������!! ������ class �� ���� ���� �� ����


public class DurRef {
	
	
	
		
	public static void main(String[] args) {
	
		
		
		BankAccount1 ref1 = new BankAccount1();
		BankAccount1 ref2 = ref1;
		
	
		
		ref1.deposit(3000);
		ref1.deposit(2000);
		ref1.withdraw(400);
		ref1.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();
		
	}
}

//<< �Ϻ��ϰ� �����ϴ� ����� �޸� �׸��� >>

