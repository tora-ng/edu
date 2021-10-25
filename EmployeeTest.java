package Test;

class Employee {
	protected String name;
	protected int age;
	protected String adress;
	protected String depart;
	protected int salary;

	Employee(String name, int age, String adress, String depart) {
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.depart = depart;
	}

	public void printinfo() {
		System.out.println("이름: " + name + '\n' + "나이: " + age + '\n' + "주소: " + adress + '\n' + "부서: " + depart);
	}
}

class Regular extends Employee {
	Regular(String name, int age, String adress, String depart) {
		super(name, age, adress, depart);

	}

//	public void setSalary() {
//		System.out.println("이름: " + super.name + '\n' + "나이: " + super.age + '\n' + "주소: " + super.adress + '\n'
//				+ "부서: " + super.depart);
//		System.out.println("정규직 월급: " + salary);
//	}
//	
//}

	public void setSalary(int salary) {
		super.salary = salary;
	}

	public void PrintInfo() {
		super.printinfo();
		System.out.println("정규직 월급: " + super.salary);
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee("양세윤", 24, "서울", "프로그래머");
		employee.printinfo();
		System.out.println("- - - - - - - - - - - - - -");
		Regular regular = new Regular("양세윤", 24, "서울", "프로그래머");
		regular.setSalary(10000);
		regular.PrintInfo();
	}

}

/*
 * 클래스 Employee(직원)은 클래스 Regular(정규직)와 Temporary(비정규직)의 상위 클래스 필드: 이름, 나이, 주소,
 * 부서, 월급 정보를 필드로 선언 생성자: 이름, 나이, 주소, 부서를 지정하는 생성자 지정 메소드 printinfo(): 인자는 없고
 * 자신의 필드 이름, 나이, 주소, 부서를 출력
 */

/*
 * 다음을 만족하는 클래스 Regular를 작성하시오.
 * 
 * - 클래스 Regular는 위에서 구현된 클래스 Employee의 하위 클래스 - 생성자 : 이름, 나이, 주소, 부서를 지정하는 상위
 * 생성자 호출 - Setter : 월급 정보 필드를 지정 - 메소드 printInfo() : 인자는 없고 기본적인 이름, 나이, 주소, 부서
 * 를 출력후 "정규직  월급" 이라는 이름으로 월급출력 -상위 클래스에서 접근제한자 수정이 필요 하면 수정 할것.
 */