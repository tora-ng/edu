/*
1.class명을 만든다.
2.데이터 멤버(인스턴스 변수)를 만든다.
3.생성자를 만든다.
4.데이터 멤버(인스턴스 변수)를 컨트롤 하는 함수를 만든다.
5.다른 소스 클래스를 그냥 대놓고 베껴 본다.
*/


package day_10_26;

class UnivFriend {
	private String name;
	private String major; // 전공
	private String phone;

	public UnivFriend(String na, String ma, String ph) {
		name = na;
		major = ma;
		phone = ph;
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전공: " + major);
		System.out.println("전화: " + phone);
	}
}

class CompFriend { // 직장 동료
	private String name;
	private String department; // 부서
	private String phone;

	public CompFriend(String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("부서: " + department);
		System.out.println("전화: " + phone);
	}
}

public class FriendTest {

	public static void main(String[] args) {
		UnivFriend[] ufrns = new UnivFriend[5];
		int unct = 0; //배열을 컨드롤 함

		CompFriend[] cfrns = new CompFriend[5];
		int ccnt = 0; //배열을 컨드롤 함

		ufrns[unct++] = new UnivFriend("Kim", "Computer", "010-3333-3333"); //후위 연산이기 때문에 여기서 1이 됨
		ufrns[unct++] = new UnivFriend("Lee", "Electronucs", "010-6666-3666"); //후위 연산이기 때문에 여기서 2이 됨

		cfrns[ccnt++] = new CompFriend("Park", "R&D 1", "02-2222-3333");
		cfrns[ccnt++] = new CompFriend("YOON", "R&D 2", "010-222-361");

		for (int i = 0; i < unct; i++) {  //unct = 2임
			ufrns[i].showInfo();
			System.out.println();
		}
		for (int i = 0; i < ccnt; i++) { //ccnt = 2임
			cfrns[i].showInfo();
			System.out.println();
		}

	}

}
