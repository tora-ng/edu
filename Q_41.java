package everyday;

import java.util.Arrays;

class Rectangle implements Comparable {
	private int width, height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}

	@Override
	public int compareTo(Object obj) {
		Rectangle rectangle = (Rectangle) obj;
		return this.getArea() - rectangle.getArea();
	}

	@Override
	public String toString() {
		return String.valueOf(getArea());
	} // System.out.println(Arrays.toString(recArr)); <<를 사용하기 위한 오버라이딩
}

public class Q_41 {

	public static void main(String[] args) {
		Rectangle[] recArr = { new Rectangle(6, 6), new Rectangle(5, 5), new Rectangle(10, 10), new Rectangle(12, 12),
				new Rectangle(11, 11) };

		Arrays.sort(recArr);

		for (Rectangle rec : recArr) {
			System.out.println(rec.getArea());
		}

		System.out.println(Arrays.toString(recArr)); // 한줄로 [ ] 안에 값을 넣기 위한 것

	}

}