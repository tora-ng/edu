// 이렇게 관리하는 것이 편하다. 타입을 1 개로 관리한다. 여러개의 class 중에 묶을 수 있는 게 있으면 무조건 묶는 것이 좋다. (다형성 적용 + 오버라이딩 사용)

package day_10_26;

class Friend { // 부모 클래스
	protected String name;
	protected String phone;

	public Friend(String na, String ph) {
		this.name = na;
		this.phone = ph;
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);

	}
}

class UnivFriend extends Friend { // 자식 클래스 1 (학교 친구)
	private String major; // 전공

	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		this.major = ma;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("전공: " + major);
	}
}

class CompFriend extends Friend { // 자식 클래스 2 (직장 동료)
	private String department; // 부서

	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		this.department = de;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("부서: " + department);
	}
}

public class FriendTest2 {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;

		frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");
		frns[cnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
		frns[cnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");

		// 모든 동창 및 동료의 정보 전체 출력
		for (int i = 0; i < cnt; i++) {
			frns[i].showInfo(); // 오버라이딩 한 메소드가 호출된다.
			System.out.println();
		}
	}
}