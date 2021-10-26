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
		return color + "���� (" + super.getX() + ", " + super.getY() + ")�� ��";
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
		super.move(x, y); //�Լ� �����ε�
		this.z = z;
	}

	public String toString() {
		return "(" + super.getX() + ", " + super.getY() + ", " + this.z + ")�� ��";

	}
}

public class Point3DTest_T {

	public static void main(String[] args) {
		
		Point3D p = new Point3D(1, 2, 3); // 1,2,3�� ����x, y, z���� ��.
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveUp(); // z ������ ���� �̵�
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveDown(); // z ������ �Ʒ��� �̵�
		p.move(10, 10); // x, y ������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(100, 200, 300); // x, y, z������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");

	}
}

/*
 * (1,2,3) �� ���Դϴ�. (1,2,4) �� ���Դϴ�. (10,10,3) �� ���Դϴ�. (100,200,300) �� ���Դϴ�.
 */