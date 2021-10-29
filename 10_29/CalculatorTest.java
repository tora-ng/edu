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
//		int result = 0;
//
//		try {
//			result = x / y;
//		} catch (Exception e) {
//			e.printStackTrace();
//			result = 0;
//			System.out.println("잘못된 입력입니다.");
//		}
//
//		return result;
//	}
//}
//
//public class CalculatorTest {
//
//	public static void main(String[] args) {
//		ICalculator cal = new Calculator();
//
//		// 출력결과 참고 하여 try catch 를 적절히 넣을것
//System.out.println(cal.add(6, 5));
//			System.out.println(cal.sub(6, 5));
//			System.out.println(cal.mul(6, 5));
//			System.out.println(cal.div(6, 0));
//			System.out.println("종료입니다.");
//		
//
//	}
//}