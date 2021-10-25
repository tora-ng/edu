package day_10_22;

import java.util.Scanner;

class Person {
	private String name;
	private int num1, num2, num3;

	public Person(String name) {
		this.name = name;
	}

	public boolean game() { // ������ ������ �̰� ȣ��

		num1 = (int) (Math.random() * 3 + 1);
		num2 = (int) (Math.random() * 3 + 1);
		num3 = (int) (Math.random() * 3 + 1);

		System.out.println("\t" + num1 + " " + num2 + " " + num3 + " ");

		if (num1 == num2 && num2 == num3) { // 3���� ���� �� �� �̷��� ��� ��
			return true;
		} else {
			return false;
		}

	}

	public String getName() { // ������ private�̶� �ʿ���
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Gembling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �̸� >>");
		String name = sc.next();
		Person p1 = new Person(name);

		System.out.print("�ι�° ���� �̸� >>");
		name = sc.next(); // ������ ������ Ÿ���� �����߱� ������ name��
		Person p2 = new Person(name);

		String buffer = sc.nextLine();
		// ^ ����Ű�� �����ִ� ���� ��� �ش�.

		while (true) {
			System.out.print("[" + p1.getName() + "]: ");
			buffer = sc.nextLine(); // ���͸� �޾Ƴ��� ���� �Է�

			if (p1.game()) {
				System.out.println("[" + p1.getName() + "]" + " ���� �̰���ϴ�.");
				break;
			}
			System.out.println("�ƽ�����.");

			System.out.print("[" + p2.getName() + "]: ");
			buffer = sc.nextLine(); // ���͸� �޾Ƴ��� ���� �Է�
			if (p2.game()) {
				System.out.println("[" + p2.getName() + "]" + " ���� �̰���ϴ�.");
				break;
			}
			System.out.println("�ƽ�����.");

		}

	}

}
