class Circle {
	
	double r;
	
	public double getR() {
		return r;
	}
	public void setR(double rad) { //void�� �ϴ� ������ ������ �ʿ� ���� rad�� ���� �־� r�� ���� ������ �ش�. ������ ���� �ʱ� ������ void ���
		r = rad; //���� �ִ� ���� ������ ���� �־� �ش�. '����'
	}
	public double getArea(){
		return r * r * Math.PI;
	}
	
}
public class AreaTest {

	public static void main(String[] args) {
		Circle circle = new Circle(); //���� ����, �޸𸮿� �� �ø���
		//���� �ϰ� ���� �� ���� �ִ� ��. �� �ִ� ���� ������ ��
		
		circle.setR(10);
		
		double area = circle.getArea();
		System.out.println(area);
		
		// �ѹ� ����� �θ� ���� �ٲٰ� ��� ����� �� �ִ�.
		
		circle.setR(20);

		area = circle.getArea();
		System.out.println(area); // System.out.println(circle.getArea()); �̰͵� ������
	}

}
