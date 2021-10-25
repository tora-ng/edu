package day_10_22;

import java.util.Scanner;

class Person1 {
	private String name;
	private int num1, num2, num3;

	public Person1(String name) {
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

public class GemblingTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("겜블링 게임에 참여할 선수의 숫자>>");
		int num = sc.nextInt();

		Person[] arrPerson = new Person[num]; // 이 부분이 중요!

		for (int i = 0; i < arrPerson.length; i++) {

			System.out.print((i + 1) + " 번째 선수 이름 >>");
			String name = sc.next();
			arrPerson[i] = new Person(name); // 배열에 객체 생성한 거 집어넣기
		}

		String buffer = sc.nextLine();

		while (true) {

			for (int i = 0; i < arrPerson.length; i++) {
				System.out.print("[" + arrPerson[i].getName() + "]: ");

				buffer = sc.nextLine(); // 엔터를 받아내기 위한 입력

				if (arrPerson[i].game()) {
					System.out.println("[" + arrPerson[i].getName() + "]" + " 님이 이겼습니다.");
					return; // break가 아니라 return임 break는 for문을 나가서 while로 돌아가기 때문에 그럼 끝나지 않아서 return으로 main
							// 전체의 while을 나감
				}
				System.out.println("아쉽군요.");

			}
		}
	}

}
