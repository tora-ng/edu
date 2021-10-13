class BankAccount1 {
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		//System.out.println(balance);
		return balance; //void를 사용해도 괜찮지만 int를 사용해 return 값을 넣은 이유는 개발할 때 바로 확인하고 싶으면 바로 확인하라고 int를 사용함.
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
	
}
// class 부분은 class 파일을 따로 만들어서 넣는 게 정석임!! 원래는 class 한 개당 파일 한 개임


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

//<< 완벽하게 이해하는 방법은 메모리 그리기 >>

