package day_10_26;

interface Printable { // class �ڸ��� interface ħ �̰� �θ�.
	public int MAX = 100; // ���

	void print(String doc); // �̰� ���� �κ��� ���� {} �Լ� ���� ��
	// public abstract void print(String doc); �� ����
	// �߻� �Լ�, abstract (�Լ� ���� ����) - �ٵ� ���� ���� �κ��� ����{}
	// public abstract�� ���� ���� - �����Ϸ��� �˾Ƽ� �ٿ� ��
	// abstract - �ڼ��� �����϶�� ��.
}

class Printer implements Printable { // extends �ڸ��� implements�� ��
// interface �ڸ��� �ִ� �� �����϶�� ��. �� �κ��� "�ڼ�" �κ�
	
	@Override
	public void print(String doc) {

		System.out.println(doc);

	}

}

public class InterfaceTest {

	public static void main(String[] args) {

		Printable printable = new Printer();
		printable.print("Hello world");
	}

}
