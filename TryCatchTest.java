package class_10_27;

public class TryCatchTest {

	public static void main(String[] args) {
		try {
			System.out.println("0 ������ ��");
			System.out.println(1 / 0);
			System.out.println("0 ������ ��"); //�� ����
			
		} catch (Exception e) { //catch �Լ�
			System.out.println("Hi~"); // ��� ������
			// e.printStackTrace();
		}
		System.out.println("good bye~");
	}

}

// CPU���� ������ �� ����, JVM���� ������. �׷��� JVM���� ������ ĳġ�Ѵ�.
// ĳġ�� ������ ������ ����(����) �κп��� �ٷ� �������� �ǽð� ������ ���.
