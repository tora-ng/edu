class Rectangle {
	int width;
	int height;
	//setter �Լ��� getter �Լ��� �� ����� ���� ����. ���� ����� ����� �� ����!!
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
		}
	
	
	public int getArea() {
		return width * height;
	}
	
}

public class RectangleEx {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		
		rec.setWidth(10);
		rec.setHeight(10);
		
		System.out.println(rec.getArea());
		
		rec.setWidth(20);
		rec.setHeight(20);
		
		System.out.println(rec.getArea());

	}

}
