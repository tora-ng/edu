package class_1029;

abstract class Fruit {
	public abstract void print(); // <부모> interface에 추상함수가 와야 한다. 자손이 구현하라는 뜻이니 자손에서 이 코드가 다 들어가야 한다.
}

class Grape extends Fruit { // <자손1>

	@Override
	public void print() {
		System.out.println("포도입니다.");
	}

}

class Apple extends Fruit { // <자손2>

	@Override
	public void print() {
		System.out.println("사과입니다.");
	}

}

class Pear extends Fruit { // <자손3>

	@Override
	public void print() {
		System.out.println("배입니다.");
	}

}

public class Question_40 {

	public static void main(String[] args) {

		Fruit[] fAry = { new Grape(), new Apple(), new Pear() };

		for (Fruit f : fAry)
			f.print(); // inhanced for문

	}

}

/*
 * - 결과 나는 포도이다. 나는 사과이다. 나는 배이다.
 */