class Person {
	private int regiNum;
	private int passNum;

	Person(int rnum, int pnum) {
		this.regiNum = rnum;
		this.passNum = pnum;
	}

	Person(int rnum) {
		this(rnum, 0); // this 생성자 함수를 이용한 코드

//		regiNum = rnum;
//		passNum = 0;
	}

	void aa() {
		System.out.println("test");
	}

	void showPersonalInfo() {
		this.aa(); // 이것도 가능하고 aa();도 가능하다

		System.out.println("주민등록 번호: " + regiNum);

		if (passNum != 0) {
			System.out.println("여권 번호: " + passNum);
		} else {
			System.out.println("여권 번호가 없습니다.");
		}
	}
}

public class showPersonalInfo {

	public static void main(String[] args) {
		// 여권 있는 사람의 정보를 담은 인스턴스 생성
		Person jung = new Person(335577, 112233);

		// 여권 없는 사람의 정보를 담은 인스턴스 생성
		Person hong = new Person(775544);

		jung.showPersonalInfo();
		hong.showPersonalInfo();

	}

}
