/*
1.class���� �����.
2.������ ���(�ν��Ͻ� ����)�� �����.
3.�����ڸ� �����.
4.������ ���(�ν��Ͻ� ����)�� ��Ʈ�� �ϴ� �Լ��� �����.
5.�ٸ� �ҽ� Ŭ������ �׳� ����� ���� ����.
*/


package day_10_26;

class UnivFriend {
	private String name;
	private String major; // ����
	private String phone;

	public UnivFriend(String na, String ma, String ph) {
		name = na;
		major = ma;
		phone = ph;
	}

	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + major);
		System.out.println("��ȭ: " + phone);
	}
}

class CompFriend { // ���� ����
	private String name;
	private String department; // �μ�
	private String phone;

	public CompFriend(String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;
	}

	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("�μ�: " + department);
		System.out.println("��ȭ: " + phone);
	}
}

public class FriendTest {

	public static void main(String[] args) {
		UnivFriend[] ufrns = new UnivFriend[5];
		int unct = 0; //�迭�� ����� ��

		CompFriend[] cfrns = new CompFriend[5];
		int ccnt = 0; //�迭�� ����� ��

		ufrns[unct++] = new UnivFriend("Kim", "Computer", "010-3333-3333"); //���� �����̱� ������ ���⼭ 1�� ��
		ufrns[unct++] = new UnivFriend("Lee", "Electronucs", "010-6666-3666"); //���� �����̱� ������ ���⼭ 2�� ��

		cfrns[ccnt++] = new CompFriend("Park", "R&D 1", "02-2222-3333");
		cfrns[ccnt++] = new CompFriend("YOON", "R&D 2", "010-222-361");

		for (int i = 0; i < unct; i++) {  //unct = 2��
			ufrns[i].showInfo();
			System.out.println();
		}
		for (int i = 0; i < ccnt; i++) { //ccnt = 2��
			cfrns[i].showInfo();
			System.out.println();
		}

	}

}
