package class_10_29_Ex;

class Circle {
	private int x;
	private int y;
	private int r;

	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override // 'toS'까지 치고 자동완성
	public String toString() {
		return "Cirlce (" + x + "," + y + ") " + "반지름" + r;
	}

	@Override // 'equa'까지 치고 자동완성
	public boolean equals(Object obj) {

		if (obj instanceof Circle) { //꼼꼼하게 오버라이딩이 가능한지 확인해 주는 문장
			
			Circle circle = (Circle) obj;
			if (this.x == circle.x && this.y == circle.y)
				return true;
		}
		return false;

	}
}

public class QuestionClass2 {

	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5); // 중심 (2, 3)에 반지름이 5인 원
		Circle b = new Circle(2, 3, 30);// 중심 (2, 3)에 반지름이 30인 원

		System.out.println("원 a: " + a); // 객체만 넣어서 '값'이 출력되게 하는 것 - toString()
		System.out.println("원 b: " + b);

		if (a.equals(b)) {
			System.out.println("같은 원");
		} else {
			System.out.println("다른 원");
		}
	}

}
