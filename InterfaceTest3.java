package day_10_26;

interface AreaGetable {
	public void print(int doc);

	double getArea();
}

class Circle implements AreaGetable {
	private int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void print(int doc) {
		double area = radius * radius * Math.PI;
		System.out.println(doc);
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

}

class Rectangle implements AreaGetable {
	private int width;
	private int height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void print(int doc) {
		int area = width * height;
		System.out.println(doc);
	}

	@Override
	public double getArea() {
		return width * height;
	}

}

class Triangle implements AreaGetable {
	private int r;
	private int a;

	Triangle(int r, int a) {
		this.r = r;
		this.a = a;
	}
	@Override
	public void print(int doc) {
		double area = (r * a) / 2;
	}
	@Override
	public double getArea() {
		return (r * a) / 2;
	}
}

public class InterfaceTest3 {

	public static void main(String[] args) {

		AreaGetable area = new Circle(4);
		System.out.println(area.getArea());

		area = new Rectangle(4, 5);
		System.out.println(area.getArea());

		area = new Triangle(4, 5);
		System.out.println(area.getArea());
	}
}
/*
 * 아래의 인터페이스에 맞추어(상속하여) 아래를 프로그래밍 하시오.
 * 
 * Circle, Rectangle , Triangle
 * 
 * 
 * interface AreaGetable{ double getArea(); }
 * 
 * 
 * main(){
 * 
 * AreaGetable area = new Circle(4); sysout(area.getArea())
 * 
 * area = new Rectangle(4,5); sysout(area.getArea())
 * 
 * area = new Triangle(4,5); sysout(area.getArea()) }
 * 
 */