/*
다음 main() 메소드와 실행 결과를 참고하여,
 Shape 인터페이스를 구현한 클래스 Oval, Rect를 추가 작성하고 전체 프로그램을 완성하라.

 */

package class_10_28;

interface Shape {
	final double PI = 3.14; // 상수

	void draw(); // 도형을 그리는 추상 메소드

	double getArea(); // 도형의 면적을 리턴하는 추상 메소드

	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
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
	public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
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
	public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
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
	public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] list = new Shape[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
		list[0] = new Circle(10); // 반지름이 10인 원 객체
		list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
		list[2] = new Rect(10, 40); // 10x40 크기의 사각형
		for (int i = 0; i < list.length; i++)
			list[i].redraw();
		for (int i = 0; i < list.length; i++)
			System.out.println("면적은 " + list[i].getArea());
	}

}

/*
 * --- 다시 그립니다.반지름이 10인 원입니다. --- 다시 그립니다.20x30에 내접하는 타원입니다. --- 다시
 * 그립니다.10x40크기의 사각형 입니다. 면적은 314.0 면적은 1884.0000000000002 면적은 400.0
 * 
 */