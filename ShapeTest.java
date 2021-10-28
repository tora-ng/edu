/*
���� main() �޼ҵ�� ���� ����� �����Ͽ�,
 Shape �������̽��� ������ Ŭ���� Oval, Rect�� �߰� �ۼ��ϰ� ��ü ���α׷��� �ϼ��϶�.

 */

package class_10_28;

interface Shape {
	final double PI = 3.14; // ���

	void draw(); // ������ �׸��� �߻� �޼ҵ�

	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�

	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}

class Circle implements Shape {
	private double r;

	Circle(double r) {
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public void draw() {

	}

	@Override
	public double getArea() {
		return r * r * PI;
	}

	@Override
	public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}

}

class Oval implements Shape {
	private double a;
	private double b;

	Oval(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public void draw() {

	}

	@Override
	public double getArea() {
		return a * b * PI;
	}

	@Override
	public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}

class Rect implements Shape {
	private double width;
	private double height;

	Rect(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void draw() {

	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�.");
		draw();
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] list = new Shape[3]; // Shape�� ��ӹ��� Ŭ���� ��ü�� ���۷��� �迭
		list[0] = new Circle(10); // �������� 10�� �� ��ü
		list[1] = new Oval(20, 30); // 20x30 �簢���� �����ϴ� Ÿ��
		list[2] = new Rect(10, 40); // 10x40 ũ���� �簢��
		for (int i = 0; i < list.length; i++)
			list[i].redraw();
		for (int i = 0; i < list.length; i++)
			System.out.println("������ " + list[i].getArea());
	}

}

/*
 * --- �ٽ� �׸��ϴ�.�������� 10�� ���Դϴ�. --- �ٽ� �׸��ϴ�.20x30�� �����ϴ� Ÿ���Դϴ�. --- �ٽ�
 * �׸��ϴ�.10x40ũ���� �簢�� �Դϴ�. ������ 314.0 ������ 1884.0000000000002 ������ 400.0
 * 
 */