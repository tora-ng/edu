import java.util.Scanner;

class Circle {
	private int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	public double setArea() {
		double area = radius * radius * Math.PI;
		return area;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("반지름 값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int radius = sc.nextInt();

		Circle r = new Circle(radius);
		
		double area = radius * radius * Math.PI;
		
		System.out.println(area);
	

	}

}
