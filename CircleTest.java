///*
//������ ������ ������ �����ϴ� �������̽��̴�.
//
//
//interface Shape {
//   final double PI = 3.14; // ���
//   void draw(); // ������ �׸��� �߻� �޼ҵ�
//   double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�
//   default public void redraw() { // ����Ʈ �޼ҵ�
//      System.out.print("--- �ٽ� �׸��ϴ�.");
//      draw();
//   }
//}
//
//���� main() �޼ҵ带 �����Ͽ�, 
//�������̽� Shape�� ������ Ŭ���� Circle�� �ۼ��ϰ� ��ü ���α׷��� �ϼ��϶�.
//
//public static void main(String[] args) {
//   Shape donut = new Circle(10); // �������� 10�� �� ��ü
//   donut.redraw();
//   System.out.println("������ "+ donut.getArea());
//}
//
// */
//
//package class_10_28;
//
//interface Shape {
//	final double PI = 3.14; // ���
//
//	void draw(); // ������ �׸��� �߻� �޼ҵ�
//
//	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�
//
//	default public void redraw() { // ����Ʈ �޼ҵ�
//		System.out.print("--- �ٽ� �׸��ϴ�.");
//		draw();
//	}
//}
//
//class Circle implements Shape {
//	private double r;
//
//	Circle(double r) {
//		this.r = r;
//	}
//
//	public double getR() {
//		return r;
//	}
//
//	public void setR(double r) {
//		this.r = r;
//	}
//
//	public void draw() {
//
//	}
//	@Override
//	public double getArea() {
//		return r * r * PI;
//	}
//
//}
//
//public class CircleTest {
//
//	public static void main(String[] args) {
//		Shape donut = new Circle(10); // �������� 10�� �� ��ü
//		donut.redraw();
//		System.out.println("������ " + donut.getArea());
//	}
//}
//
///*
// * --- �ٽ� �׸��ϴ�.�������� 10�� ���Դϴ�. ������ 314.0
// */