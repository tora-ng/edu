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
			str = "���Դϴ�";
		} else if (80 <= avg) {
			str = "���Դϴ�";
		} else {
			str = "���Դϴ�";
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
		System.out.println("����� " + me.average()); // "��"�Դϴ�.
		}
	}

//��� ���� �Է��ϴ� ��� �ڵ嵵 �ۼ��� ����.
