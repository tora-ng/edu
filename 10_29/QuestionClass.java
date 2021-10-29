/*
다음 main()이 실행되면 아래 예시와 같이 출력되도록 MyPoint를 작성하라.
Point(3, 50) 다른점
*/

package class_10_29_Ex;

class MyPoint {
	private int x;
	private int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}

	@Override
	public boolean equals(Object obj) { // Object에 있는 equals를 나한테 맞게 만들어야 한다. - 오버라이딩
		MyPoint point = (MyPoint) obj;
		if (this.x == point.x && this.y == point.y) {
			return true;
		} else {
			return false;
		} // -> 선생님이 한 것
	}
}
//		if (this.x == ((MyPoint) obj).x && this.y == ((MyPoint) obj).y) {
//			return true;
//		}  -> 내가 한 것

public class QuestionClass {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);

		System.out.println(p);  // 객체를 다이렉트로 넣었을 때는 1) 주소가 출력됨 2) 값이 출력됨 - 함수 오버라이딩 오버라이딩 안 하면 주소가 나옴!!

		if (p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}

}
