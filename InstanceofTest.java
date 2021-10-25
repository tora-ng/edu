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
		//1, 2는 box1에 GoldPaperBox과 PaperBox이 없기 때문에 출력 안 하고 3만 출력
		wrapBox(box2);
		//box2에 GoldPaperBox가 없기 때문에 1을 출력 안 하고 2만 출력한다. 3은 가지고 있음
		wrapBox(box3);
		//box3에는 GoldPaperBox도, PaperBox도, Box도 있기 때문에 GoldPaperBox를 출력한다.
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
