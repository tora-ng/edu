package day_10_22;

import java.util.Scanner;

class Person1 {
	private String name;
	private int num1, num2, num3;

	public Person1(String name) {
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

public class GemblingTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�׺� ���ӿ� ������ ������ ����>>");
		int num = sc.nextInt();

		Person[] arrPerson = new Person[num]; // �� �κ��� �߿�!

		for (int i = 0; i < arrPerson.length; i++) {

			System.out.print((i + 1) + " ��° ���� �̸� >>");
			String name = sc.next();
			arrPerson[i] = new Person(name); // �迭�� ��ü ������ �� ����ֱ�
		}

		String buffer = sc.nextLine();

		while (true) {

			for (int i = 0; i < arrPerson.length; i++) {
				System.out.print("[" + arrPerson[i].getName() + "]: ");

				buffer = sc.nextLine(); // ���͸� �޾Ƴ��� ���� �Է�

				if (arrPerson[i].game()) {
					System.out.println("[" + arrPerson[i].getName() + "]" + " ���� �̰���ϴ�.");
					return; // break�� �ƴ϶� return�� break�� for���� ������ while�� ���ư��� ������ �׷� ������ �ʾƼ� return���� main
							// ��ü�� while�� ����
				}
				System.out.println("�ƽ�����.");

			}
		}
	}

}
