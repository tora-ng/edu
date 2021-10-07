
public class OddNumPlus {

	public static void main(String[] args) {

		/*홀수들의 합
		int sum = 0;
		for (int i = 1; i <= 100; i++)
			if (i % 2 == 1) {
				sum = sum + i;
				System.out.println(i + ":" + sum);
		}
		*/
		
		//짝수들의 합
		int sum = 0;
		for (int i = 1; i <= 100; i++)
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println(i + ":" + sum);
		}
		
	}
}

