package java_area;

public class TypeChange {

	public static void main(String[] args) {

		int num1 = 100;
		long num2 = 3100000000L; // 뒤에 L이 없으면 오류 남
		// 컴퓨터는 멍청해서 반드시 연산 시 두 개의 형을 일치시킨다.
		// int인 num1을 long으로 바꾸거나 long인 num2를 int로 바꾸거나 해야 한다.
		float num3 = 1.12f; // 실수는 double로 생각하기 때문에 뒤에 f가 없으면 오류 남

		long result = num1 + num2;

		System.out.println(result);

		
		short a = 10;
		short b = 20;
		short r = (short)(a + b);
		System.out.println(r);
		
		
		double pi = 3.14;
		int num4 = (int)pi; //(int)을 씀으로써 강제 형변환을 해 준다.
		System.out.println(num4); //3이 나와서 뒷부분이 보존 안 됨
		
		long num5 = 3000000007L;;
		int num6 = (int)num5;
		System.out.println(num6);
	
		int num7 = 3;
		int num8 = 4;
		
		double result2 = num7 / num8;
		
		System.out.println(result2);
		
		/*
		num3 / num4 각자의 값을 메모리에 보내서 계산을 하면 어딘가에 이 값이 메모리로 저장이 되어 있다.
		이때 메모리를 저장하려면 JAVA에서는 데이터 타입을 꼭 먼저 정해야 한다.
		법칙: 데이터 타입이 int - int 연산을 하게 되면 결과값의 데이터 타입도 int로 잡아 주게 된다.
		그래서 위 소스에서 0.75가 아닌 0.0이 출력되는 이유는 num3과 num4가 int 타입의 연산이기 때문에 연산 하였을 때 나오는 값, 0.75에서 소숫점을 떨어트리고
		이것이 double로 대입 됐을 때 0.0이 되는 것이다.

		-> double result = num3 / (double)num4; 로 수정하면 고칠 수 있다
		-> double result = (double)(num3 / num4); 이게 안 되는 이유는, 형변환이 먼저가 아니라 (num3 / num4)의 연산이 먼저 되기 때문에 여전히 int 타입이다.
		*/
	}

}
