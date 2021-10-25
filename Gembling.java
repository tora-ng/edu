package day_10_22;

import java.util.Scanner;

class Person {
	private String name;
	private int num1, num2, num3;

	public Person(String name) {
		this.name = name;
	}

	public boolean game() { // 엔터할 때마다 이거 호출

		num1 = (int) (Math.random() * 3 + 1);
		num2 = (int) (Math.random() * 3 + 1);
		num3 = (int) (Math.random() * 3 + 1);

		System.out.println("\t" + num1 + " " + num2 + " " + num3 + " ");

		if (num1 == num2 && num2 == num3) { // 3개가 같은 거 꼭 이렇게 써야 함
			return true;
		} else {
			return false;
		}

	}

	public String getName() { // 변수가 private이라 필요함
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Gembling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 선수 이름 >>");
		String name = sc.next();
		Person p1 = new Person(name);

		System.out.print("두번째 선수 이름 >>");
		name = sc.next(); // 위에서 데이터 타입을 선언했기 때문에 name만
		Person p2 = new Person(name);

		String buffer = sc.nextLine();
		// ^ 엔터키가 남아있는 것을 비워 준다.

		while (true) {
			System.out.print("[" + p1.getName() + "]: ");
			buffer = sc.nextLine(); // 엔터를 받아내기 위한 입력

			if (p1.game()) {
				System.out.println("[" + p1.getName() + "]" + " 님이 이겼습니다.");
				break;
			}
			System.out.println("아쉽군요.");

			System.out.print("[" + p2.getName() + "]: ");
			buffer = sc.nextLine(); // 엔터를 받아내기 위한 입력
			if (p2.game()) {
				System.out.println("[" + p2.getName() + "]" + " 님이 이겼습니다.");
				break;
			}
			System.out.println("아쉽군요.");

		}

	}

}
