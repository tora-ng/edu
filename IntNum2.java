
public class IntNum2 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		num1 = 500;
		num2 = 300;
		num3 = 200;
		
		if (num1 < num2) {
			if (num2 < num3) {
				System.out.println(num3);
			}
			else {
				System.out.println(num2);
			}
		}
		else {
			System.out.println(num1);
		}
	}

}



