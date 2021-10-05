package java_area;

public class ArithOp {

	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 3; 
		//연산자 우선 순위 중 괄호()가 가장 높음
		
		num1 = num1 + 1; //num1 += 1; //+=은 자기 것에 +1(+)을 하고 대입(=)해 준다.
		
		System.out.println(num1);
		
		System.out.println("num1 + num2 = " + (num1 + num2)); //자동형변환
		//System.out.println("num1 + num2 = " + "10"); //원래 이거임 자동 형변환이 된 것 앞이 문자열이니 뒤도 문자열로 형변환 시켜 줌
		System.out.println("num1 + num2 = " + (num1 - num2));
		System.out.println("num1 + num2 = " + (num1 * num2));
		System.out.println("num1 + num2 = " + (num1 / num2));
		System.out.println("num1 + num2 = " + (num1 % num2)); // 7/3를 나눈 값의 나머지를 가져온다
	}

}
