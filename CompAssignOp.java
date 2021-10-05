package java_area;

public class CompAssignOp {

	public static void main(String[] args) {

		short num = 10;
		num = (short) (num + 77L); //형변환 안 하면 오류 발생 () 안이 long이고 short로 형변환을 시키려면 강제형변환을 해 줘야 한다
		
		int rate = 3;
		rate = (int) (rate * 3.5); //형변환 안 하면 오류 발생 () 안의 계산 결과가 실수임(int 형*double 형) 실수를 그냥 int에 넣을 수 없으니 형변환이 필요하다
		//소숫점 값이 정수로 변하면 소숫점을 버린 값이 나온다.
		
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L; //형변환 안 해도 됨

		rate = 3;
		rate *= 3.5; //형변환 안 해도 됨

		System.out.println(num);
		System.out.println(rate);
	}

}
