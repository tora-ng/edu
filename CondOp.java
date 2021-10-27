package class_10_27;

interface AreaGetable {
	double getArea();
}

class Circle implements AreaGetable {
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {

		return r * r * Math.PI;
	}
}

class Rectangle implements AreaGetable {

	private double width, height;

	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		return width * height;
	}

}

public class CondOp {

	public static double getAllArea(AreaGetable[] area) {
		double sum = 0;

		for (AreaGetable areaGetable : area) {
			sum = sum + areaGetable.getArea();
		}

		for (int i = 0; i < area.length; i++) {
			sum = sum + area[i].getArea();
		}

		return sum;

	}

	public static void main(String[] args) {
		AreaGetable[] area = { new Rectangle(4, 5), new Circle(4) };

		// AreaGetable oneArea = new Circle(4);
		System.out.println(getAllArea(area)); // 함수가 main에 속해야 함
		System.out.println(getArea(new Circle(10))); // 314
		System.out.println(getArea(new Rectangle(4, 5))); // 320

		// oneArea = new Rectangle(4,5);
		// System.out.println(area.getArea());
	}

	
	
	// 함수 오버라이딩 사용해서
	private static double getArea(AreaGetable area) {
		return area.getArea();
	}

	
	
//	private static double getArea(Circle circle) {
//		return circle.getArea();
//	}
//
//	private static double getArea(Rectangle rectangle) {
//		
//		return rectangle.getArea();
//	}

}
