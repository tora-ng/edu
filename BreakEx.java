
public class BreakEx {

	public static void main(String[] args) {

		/*
		 * int num = 1;
		 * 
		 * 
		 * while( (num++) < 1000 ) {
		 * 
		 * if ((num % 2 == 0) && (num % 3 == 0)) { System.out.println(num); } }
		 */

		// 1
		for (int i = 1; i <= 1000; i++) { // for�� ���� i�� for�� �ȿ����� ��ȿ�ϴ�.
			if ((i % 2 == 0) && (i % 3 == 0)) {
				System.out.println(i);
				break;
			}
		}

		// 2
		int j;
		for (j = 1; j <= 1000; j++) { // for�� ���� i�� for�� �ȿ����� ��ȿ�ϴ�.
			if ((j % 2 == 0) && (j % 3 == 0)) {
				break;
			}
		}
		System.out.println(j);
	}

}

//1�� 1000 ������ ���� �� 2�� ������� 3�� ����� ���� �� ù��° ���� ����ϴ� ���α׷�
