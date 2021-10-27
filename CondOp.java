package day_10_27;

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

	public static void main(String[] args) {
		AreaGetable[] area = { new Rectangle(4, 5), new Circle(4), new Circle(4), new Circle(5), new Circle(5),
				new Circle(6), new Rectangle(4, 5), new Rectangle(4, 5), new Rectangle(4, 5), };

		// AreaGetable oneArea = new Circle(4);
		System.out.println(getAllArea(area));
		System.out.println(getArea(new Circle(10))); // 314
		System.out.println(getArea(new Rectangle(4, 5))); // 20

		// oneArea = new Rectangle(4,5);
		// System.out.println(area.getArea());

	}

	public static double getAllArea(AreaGetable[] area) {
		double sum = 0;

		for (int i = 0; i < area.length; i++) {
			sum = sum + area[i].getArea();
		}
		return sum;
	}

	public static double getArea(AreaGetable area) {
		return area.getArea();
	}
}
