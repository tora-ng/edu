//package class_1029;
//
//interface ICalculator {
//	int add(int x, int y);
//
//	int sub(int x, int y);
//
//	int mul(int x, int y);
//
//	int div(int x, int y);
//}
//
//class Calculator implements ICalculator {
//	int sum = 0;
//
//	@Override
//	public int add(int x, int y) {
//		return x + y;
//	}
//
//	@Override
//	public int sub(int x, int y) {
//		return x - y;
//	}
//
//	@Override
//	public int mul(int x, int y) {
//		return x * y;
//	}
//
//	@Override
//	public int div(int x, int y) {
//		return x / y;
//	}
//}
//
//public class CalculatorTest {
//
//	public static void main(String[] args) {
//		ICalculator cal = new Calculator();
//
//		// 출력결과 참고 하여 try catch 를 적절히 넣을것
//		try {
//			System.out.println(cal.add(6, 5));
//			System.out.println(cal.sub(6, 5));
//			System.out.println(cal.mul(6, 5));
//			System.out.println(cal.div(6, 0));
//		} catch (Exception e) {
//			e.printStackTrace(); // Exception 에러를 출력
//		} finally {
//			System.out.println("종료입니다.");
//		}
//
//	}
//}