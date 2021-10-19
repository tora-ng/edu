
public class ArrayTest {

	public static void main(String[] args) {
		//길이가 5인 int형 1차원 배열의 생성
		int[] ar1 = new int[5]; //20byte
		
		//길이가 5인 double형 1차원 배열의 생성
		double[] ar2 = new double[7]; //56byte
		
		//배열의 참조변수와 인스턴스 생성 분리
		float[] ar3;
		ar3 = new float[9]; //36byte
		
		//배열의 인스턴스 변수 접근
		System.out.println("배열 ar1의 길이: " + ar1.length); //함수는 str.length();이렇게 쓰는데 얘는 함수가 아닌 변수이기 때문에 ar1.length 이렇게 쓴다
		System.out.println("배열 ar1의 길이: " + ar2.length);
		System.out.println("배열 ar1의 길이: " + ar3.length);
	}

}
