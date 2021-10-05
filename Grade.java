package java_area;

public class Grade {

	public static void main(String[] args) {
		
		int kor = 50;
		int eng = 70;
		int math = 95;
		
		int sum = kor + eng + math;
		
		//double avg = (double)sum / 3;
		double avg = sum / 3.0; //13줄 14줄 둘 다 됨
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		//class명은 대문자로 시작
		//변수명, class명 가시적으로 적기
	}

}
