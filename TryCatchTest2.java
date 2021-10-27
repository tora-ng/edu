package class_10_27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		try {
			System.out.print("a/b ... a��?");
			int n1 = kb.nextInt();
			System.out.print("a/b ... b��?");
			int n2 = kb.nextInt();

			System.out.println("a / b�� " + n1 / n2);
		} catch (ArithmeticException | InputMismatchException ex) {
			ex.getMessage();
			//ex.printStackTrace();
		}
		System.out.println("Try Catch");

	}

}
