// �̷��� �����ϴ� ���� ���ϴ�. Ÿ���� 1 ���� �����Ѵ�. �������� class �߿� ���� �� �ִ� �� ������ ������ ���� ���� ����. (������ ���� + �������̵� ���)

package day_10_26;

class Friend { // �θ� Ŭ����
	protected String name;
	protected String phone;

	public Friend(String na, String ph) {
		this.name = na;
		this.phone = ph;
	}

	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + phone);

	}
}

class UnivFriend extends Friend { // �ڽ� Ŭ���� 1 (�б� ģ��)
	private String major; // ����

	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		this.major = ma;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("����: " + major);
	}
}

class CompFriend extends Friend { // �ڽ� Ŭ���� 2 (���� ����)
	private String department; // �μ�

	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		this.department = de;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("�μ�: " + department);
	}
}

public class FriendTest2 {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;

		frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");
		frns[cnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
		frns[cnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");

		// ��� ��â �� ������ ���� ��ü ���
		for (int i = 0; i < cnt; i++) {
			frns[i].showInfo(); // �������̵� �� �޼ҵ尡 ȣ��ȴ�.
			System.out.println();
		}
	}
}