package class_10_29_Ex;

class INum {
	private int num;

	public INum(int num) {
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.num == ((INum) obj).num) {
			return true;
		} else
			return false;
	}

}

public class EqualsTest {

	public static void main(String[] args) {
		INum num1 = new INum(10);
		INum num2 = new INum(12);
		INum num3 = new INum(10);

		if (num1.equals(num2)) {
			System.out.println("내용 동일");
		} else {
			System.out.println("내용 다름");
		}
		if (num1.equals(num3)) {
			System.out.println("내용 동일");
		} else {
			System.out.println("내용 다름");
		}

	}

}
