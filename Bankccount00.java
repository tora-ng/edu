class BankAccount {
	
	//char ch = 'A'; //얘는 문자를 출력하고 String은 문자열을 출력한다.
	// char =/= String
	// char은 '', String은 ""로 표현한다.
	// String 안에는 함수가 엄청 많다!!
	
	String name = "바둑이"; //참조형. 멤버 변수에서도 getter setter 함수 만든다

	int balance = 0;
	String accNumber;
	String ssNumber;

	BankAccount(String acc, String ss, int bal) {
		//생성자 !! 얘를 만들었기 때문에 디폴트 생성자를 만들지 않는다.
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public void initAccount(String acc, String ss, int bal) {
		//초기화를 위한 메소드
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public String getName() { //타입이 String 타입이라 String 써 줌
		return name;
	}
	//Strint을 리턴함
	
	public void setName(String name) {
		this.name = name; //this.는 클래스 안에 있는 건 파라미터가 아니고 변수명이라는 걸 알려 주는 것이다.
	}
	
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
		System.out.println("주민번호 : " + accNumber);
		System.out.println("계좌번호 : " + ssNumber);
		return balance;
	}
	
}
// class 부분은 class 파일을 따로 만들어서 넣는 게 정석임!! 원래는 class 한 개당 파일 한 개임


public class Bankccount00 {
	
	public static void printNum(int num) {
		System.out.println(num);
	}
	public static void printBank(BankAccount acc) { // printBank( )의 괄호 안에 참조형도 올 수 있다.
		acc.checkMyBalance();		
	}
	public static void main(String[] args) {
		// 생성자(Constructor): 내가 만든 게 아닌데 사용
		BankAccount yoon = new BankAccount("12-34-56", "999999-999999", 10000); //객체 1 < BankAccount(String acc, String ss, int bal) 이 값들이 객체 생성하자마자 들어감


		BankAccount park = new BankAccount("12-34-56", "999999-999999", 10000); //객체 2

		//BankAccount choi = new BankAccount(); //이게 안 되는 이유는, 개발자가 생성자를 하나라도 만들었으면 디폴트 생성자를 넣지 않는다. 
		
		yoon.setName("윤윤윤");
		park.setName("박박박");
		
		System.out.println(yoon.getName());
		System.out.println(park.getName());
		
		
		// yoon = null;
		// 에러 남 -> 가리키는 주소 없음 - 관계를 끊는다.  
		// JVM에게 해당 메모리가 정리 대상임을 알려주는 것.
		// 메모리에 있는 안 쓰는 걸 정리해 준다. C언어는 포인트가 함
		
		//각 인스턴스를 대상으로 예금을 진행
		
		if (yoon == null) {
			yoon = new BankAccount("12-34-56", "999999-999999", 10000);
		} else {
			yoon.deposit(5000);
		}
		//null 줬을 때 오류 막는 방법 얘는 null check라 부름

		//yoon.deposit(5000);
		park.deposit(3000);
		
		//각 인스턴스를 대상으로 출금을 진행
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		//각 인스턴스를 대상으로 잔액을 조회
		yoon.checkMyBalance();
		park.checkMyBalance();
		
		printBank(yoon);
		System.out.println(yoon);
		
	}

}

//public class BankAccount {
//    
//
//	int balance = 0;     // 예금 잔액
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
//        System.out.println("잔액 : " + balance);
//        return balance;
//    }
//}

