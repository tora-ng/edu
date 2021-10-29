package class_10_29_Ex;

class Point implements Cloneable {
	private int xPos;
	private int yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}

	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Rectangle implements Cloneable {
	private Point upperLeft; // 좌측 상단 좌표
	private Point lowerRight; // 우측 하단 좌표

	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}

	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
//		return super.clone(); - 얕은 카피
		
		
		
		Rectangle copy = (Rectangle) super.clone();

		// 깊은 복사의 형태로 복사본을 수정
		copy.upperLeft = (Point) upperLeft.clone();
		copy.lowerRight = (Point) lowerRight.clone();

		// 완성된 복사본의 참조를 반환
		return copy;

	}

	public void showPosition() {
		System.out.print("좌측 상단 좌표: ");
		upperLeft.showPosition();

		System.out.print("우측 하단 좌표: ");
		lowerRight.showPosition();
		System.out.println();
	}
}

class ShallowDeepCopyTest {
	public static void main(String[] args) {
		Rectangle org = new Rectangle(1, 1, 9, 9);
		Rectangle cpy;

		try {

			cpy = (Rectangle) org.clone();

			org.changePos(2, 2, 7, 7);

			org.showPosition();

			cpy.showPosition();

			System.out.println("- - - - - - - - - - - " + '\n');

			org.changePos(3, 3, 3, 3);

			org.showPosition();

			cpy.showPosition();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}


/*
<< 얕은 카피 값 >>
좌측 상단 좌표: [2, 2]
우측 하단 좌표: [7, 7]

좌측 상단 좌표: [2, 2]
우측 하단 좌표: [7, 7] -> copy 한 것이 값을 따라감

- - - - - - - - - - - 

좌측 상단 좌표: [3, 3]
우측 하단 좌표: [3, 3]

좌측 상단 좌표: [3, 3]
우측 하단 좌표: [3, 3] -> copy 한 것이 값을 따라감

*/

/*
<< 깊은 카피 값 >>
좌측 상단 좌표: [2, 2]
우측 하단 좌표: [7, 7]

좌측 상단 좌표: [1, 1]
우측 하단 좌표: [9, 9] -> copy 한 것이 값을 따라가지 않음

- - - - - - - - - - - 

좌측 상단 좌표: [3, 3]
우측 하단 좌표: [3, 3]

좌측 상단 좌표: [1, 1]
우측 하단 좌표: [9, 9] -> copy 한 것이 값을 따라감
*/