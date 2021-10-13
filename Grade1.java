class Grade2 {
	int math;
	int science;
	int english;
	
	public Grade2 (int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public double avg1() {
		double avg1 = (math + science + english) / 3;
		return avg1;
			
		}
	public String average() {
	double avg = (math + science + english) / 3;
		String str;
		if (90 <= avg) {
			str = "수입니다";
		} else if (80 <= avg) {
			str = "우입니다";
		} else {
			str = "가입니다";
		}
		return str;
	}
	
}

public class Grade1 {

	public static void main(String[] args) {
		int math, science, english;
		math = 90;
		science = 100;
		english = 100;
		
		Grade2 me = new Grade2(math, science, english);
		System.out.println("평균은 " + me.average()); // "우"입니다.
		}
	}

//평균 점수 입력하는 출력 코드도 작성해 보기.
