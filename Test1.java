class TV {

	String brand;
	int year;
	int inch;

//	public TV(String br, int ye, int in) { //Ʋ�ȴ� ������ void ������ [������]
//		brand = br;
//		year = ye;
//		inch = in;
// ���� �̷��� �ص� �ǰ� �Ʒ��� �ص� ��!!! �ٵ� �Ʒ��� �� ��Ȯ�ϴϱ� �Ʒ��� ���� ���� �� �ֱ�.

	TV(String brand, int year, int inch) {
		this.brand = brand; // ������� �Ȱ����� �տ� this. �ٿ��� �Ѵ�
		this.year = year;
		this.inch = inch;
	}

	public void show() {
		System.out.println(brand + "���� ���� " + year + "�� " + inch + "��ġ TV");
	}
}

class Grade {

	int math;
	int science;
	int english;
	double avg;
	
	// ������ class �̸��� �Ȱ���
	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;

	}

	public double average() {
		double avg = (math + science + english) / 3.0;
		return avg;
	}
	public String getGrade() {
		double avg = average();
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
	
	
//	public void getGrade() {
//		System.out.println("���Դϴ�");
//	}
}

public class Test1 {

	public static void main(String[] args) {

//1		
		TV myTV = new TV("LG", 2017, 32); // LG���� ���� 2017�� 32��ġ //������. ������� �ʱ�ȭ ���� �ִ� �뵵. �� �� ���� ������ ����� ������ �ִ�.

		myTV.show();

//2		
		TV yourTv = new TV("�Ｚ", 2021, 70); // LG���� ���� 2017�� 32��ġ //������. ������� �ʱ�ȭ ���� �ִ� �뵵. �� �� ���� ������ ����� ������ �ִ�.

		yourTv.show();

// =====================================================================================

		int math, science, english;
		math = 90;
		science = 100;
		english = 80;

		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());

		System.out.println(me.getGrade()); // ���Դϴ�. //���� void�� sysout~ �ϸ� me.getGrade()�� void�� �ȴ�. ���ϰ��� ���� ������ ������ ��. String���� ����ؾ� �Ѵ�.

	}

}

/*
 * <1��> public static void main(Strint[] args) {
 * 
 * TV myTV = new TV("LG", 2017, 32); //LG���� ���� 2017�� 32��ġ
 * 
 * myTV.show();
 * 
 * }
 * 
 * ���: LG���� ���� 2017�� 32��ġ TV
 */

/*
 * <2��> ���� yourTv �Ｚ 2021 70 ���� class�� ����ϱ�!!!!
 */

/*
 * <3��> int math, science, english; math = 90; science = 100; english = 80;
 * 
 * Grade me = new Grade(math, science, english); System.out.println("����� " +
 * me.average());
 */

/*
4�� 
System.out.println(me.getGrade()); // ���Դϴ�.
*/