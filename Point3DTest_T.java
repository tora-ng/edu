package day_10_25;

class Point {
	private int x, y;

	public Point() {

	}

	public Point(int x, int y) {
		this.move(x, y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point {
	private String color = "BLACK";

	public ColorPoint() {

	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public ColorPoint(int x, int y) {
		super(x, y);
	}

	public void setXY(int x, int y) {
		super.move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return color + "색의 (" + super.getX() + ", " + super.getY() + ")의 점";
	}
}

class Point3D extends Point {
	int z;

	public Point3D() {

	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void moveUp() {
		this.z++;
		//z += 1;
	}

	public void moveDown() {
		this.z--;
		//z -= 1;

	}

	public void move(int x, int y, int z) {
		super.move(x, y); //함수 오버로딩
		this.z = z;
	}

	public String toString() {
		return "(" + super.getX() + ", " + super.getY() + ", " + this.z + ")의 점";

	}
}

public class Point3DTest_T {

	public static void main(String[] args) {
		
		Point3D p = new Point3D(1, 2, 3); // 1,2,3은 각각x, y, z축의 값.
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp(); // z 축으로 위쪽 이동
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10); // x, y 축으로 이동
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300); // x, y, z축으로 이동
		System.out.println(p.toString() + "입니다.");

	}
}

/*
 * (1,2,3) 의 점입니다. (1,2,4) 의 점입니다. (10,10,3) 의 점입니다. (100,200,300) 의 점입니다.
 */