class TV {

	String brand;
	int year;
	int inch;

//	public TV(String br, int ye, int in) { //틀렸던 이유는 void 때문에 [생성자]
//		brand = br;
//		year = ye;
//		inch = in;
// 위에 이렇게 해도 되고 아래로 해도 됨!!! 근데 아래가 더 명확하니까 아래로 적는 연습 해 주기.

	TV(String brand, int year, int inch) {
		this.brand = brand; // 변수명과 똑같으면 앞에 this. 붙여야 한다
		this.year = year;
		this.inch = inch;
	}

	public void show() {
		System.out.println(brand + "에서 만든 " + year + "년 " + inch + "인치 TV");
	}
}

class Grade {

	int math;
	int science;
	int english;
	double avg;
	
	// 생성자 class 이름과 똑같다
	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;

	}

	public double average() {
		double avg = (math + science + english) / 3.0;
		return avg;
	}
	public String getGrade() {
		double avg = average();
		String str;
		
		if (90 <= avg) {
			str = "수입니다";
		} else if (80 <= avg) {
			str = "우입니다";
		} else {
			str = "가입니다";
		}
		
		return str;
	}
	
	
//	public void getGrade() {
//		System.out.println("우입니다");
//	}
}

public class Test1 {

	public static void main(String[] args) {

//1		
		TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년 32인치 //생성자. 멤버변수 초기화 시켜 주는 용도. 이 세 개를 데이터 멤버로 가지고 있다.

		myTV.show();

//2		
		TV yourTv = new TV("삼성", 2021, 70); // LG에서 만든 2017년 32인치 //생성자. 멤버변수 초기화 시켜 주는 용도. 이 세 개를 데이터 멤버로 가지고 있다.

		yourTv.show();

// =====================================================================================

		int math, science, english;
		math = 90;
		science = 100;
		english = 80;

		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());

		System.out.println(me.getGrade()); // 우입니다. //위에 void로 sysout~ 하면 me.getGrade()가 void가 된다. 리턴값이 없기 때문에 에러가 남. String으로 사용해야 한다.

	}

}

/*
 * <1번> public static void main(Strint[] args) {
 * 
 * TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
 * 
 * myTV.show();
 * 
 * }
 * 
 * 출력: LG에서 만든 2017년 32인치 TV
 */

/*
 * <2번> 변수 yourTv 삼성 2021 70 만든 class를 사용하기!!!!
 */

/*
 * <3번> int math, science, english; math = 90; science = 100; english = 80;
 * 
 * Grade me = new Grade(math, science, english); System.out.println("평균은 " +
 * me.average());
 */

/*
4번 
System.out.println(me.getGrade()); // 우입니다.
*/