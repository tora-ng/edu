
public class OddNumPlus {

	public static void main(String[] args) {

		/*Ȧ������ ��
		int sum = 0;
		for (int i = 1; i <= 100; i++)
			if (i % 2 == 1) {
				sum = sum + i;
				System.out.println(i + ":" + sum);
		}
		*/
		
		//¦������ ��
		int sum = 0;
		for (int i = 1; i <= 100; i++)
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println(i + ":" + sum);
		}
		
	}
}

