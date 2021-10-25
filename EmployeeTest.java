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
		System.out.println("�̸�: " + name + '\n' + "����: " + age + '\n' + "�ּ�: " + adress + '\n' + "�μ�: " + depart);
	}
}

class Regular extends Employee {
	Regular(String name, int age, String adress, String depart) {
		super(name, age, adress, depart);

	}

//	public void setSalary() {
//		System.out.println("�̸�: " + super.name + '\n' + "����: " + super.age + '\n' + "�ּ�: " + super.adress + '\n'
//				+ "�μ�: " + super.depart);
//		System.out.println("������ ����: " + salary);
//	}
//	
//}

	public void setSalary(int salary) {
		super.salary = salary;
	}

	public void PrintInfo() {
		super.printinfo();
		System.out.println("������ ����: " + super.salary);
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee("�缼��", 24, "����", "���α׷���");
		employee.printinfo();
		System.out.println("- - - - - - - - - - - - - -");
		Regular regular = new Regular("�缼��", 24, "����", "���α׷���");
		regular.setSalary(10000);
		regular.PrintInfo();
	}

}

/*
 * Ŭ���� Employee(����)�� Ŭ���� Regular(������)�� Temporary(��������)�� ���� Ŭ���� �ʵ�: �̸�, ����, �ּ�,
 * �μ�, ���� ������ �ʵ�� ���� ������: �̸�, ����, �ּ�, �μ��� �����ϴ� ������ ���� �޼ҵ� printinfo(): ���ڴ� ����
 * �ڽ��� �ʵ� �̸�, ����, �ּ�, �μ��� ���
 */

/*
 * ������ �����ϴ� Ŭ���� Regular�� �ۼ��Ͻÿ�.
 * 
 * - Ŭ���� Regular�� ������ ������ Ŭ���� Employee�� ���� Ŭ���� - ������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ����
 * ������ ȣ�� - Setter : ���� ���� �ʵ带 ���� - �޼ҵ� printInfo() : ���ڴ� ���� �⺻���� �̸�, ����, �ּ�, �μ�
 * �� ����� "������  ����" �̶�� �̸����� ������� -���� Ŭ�������� ���������� ������ �ʿ� �ϸ� ���� �Ұ�.
 */