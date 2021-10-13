class Circle1 {
	int radius;
	public void setRadius(int r) {
		radius = r;
	}
	public int getRadius() {
		return radius;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	}
	
public class AreaTest2 {

	public static void main(String[] args) {
		Circle1 circle = new Circle1();
		circle.setRadius(10);
		
		
		double area = circle.getArea();
		System.out.println(area);
	}

}
