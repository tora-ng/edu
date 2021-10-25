package day_10_22;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y; // �ڽĿ��� �� ȣ���ϸ� �� protected
	}
}

class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y); // �θ� Ŭ�������� �����ڰ� �ֱ� ������ super( )�� �� ��
		this.color = color;
	}

	public void setXY(int x, int y) {
		super.move(x, y);

	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		String str = null;

		str = this.color + "���� (" + super.getX() + "," + super.getY() + ")�� ��";

		return str;
	}
}

public class PointTest {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20); // �� �Լ��� �θ� Ŭ������ ����
		cp.setColor("RED"); // ���� �ٲ� ����
		String str = cp.toString();
		System.out.println(str + "�Դϴ�. ");

	}

}
/*
 * ������ 2���� ���� �� ���� ǥ���ϴ� Point Ŭ�����̴�. Point�� ��ӹ޾� ���� ���� ���� ��Ÿ���� ColorPoint Ŭ������
 * �ۼ��϶�. ���� main() �޼ҵ带 �����ϰ� ���� ����� ���� ��µǰ� �϶�.
 */