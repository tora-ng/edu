package Test;

class Box {
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("Gold Wrapping");
	}
}

public class InstanceofTest {

	public static void main(String[] args) {
		Box box1 = new Box();

		PaperBox box2 = new PaperBox();

		GoldPaperBox box3 = new GoldPaperBox();

		wrapBox(box1);
		//1, 2�� box1�� GoldPaperBox�� PaperBox�� ���� ������ ��� �� �ϰ� 3�� ���
		wrapBox(box2);
		//box2�� GoldPaperBox�� ���� ������ 1�� ��� �� �ϰ� 2�� ����Ѵ�. 3�� ������ ����
		wrapBox(box3);
		//box3���� GoldPaperBox��, PaperBox��, Box�� �ֱ� ������ GoldPaperBox�� ����Ѵ�.
	}

	public static void wrapBox(Box box) {
		if (box instanceof GoldPaperBox) {
			((GoldPaperBox)box).goldWrap(); //1
		} else if (box instanceof PaperBox) {
			((PaperBox) box).paperWrap(); //2
		} else {
			box.simpleWrap(); //3
		}
	}

}
