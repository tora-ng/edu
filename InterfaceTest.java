package day_10_26;

interface Printable { // class 자리에 interface 침 이게 부모.
	public int MAX = 100; // 상수

	void print(String doc); // 이건 구역 부분이 없음 {} 함수 선언만 함
	// public abstract void print(String doc); 도 가능
	// 추상 함수, abstract (함수 선언만 가능) - 바디 실제 구현 부분이 없음{}
	// public abstract는 생략 가능 - 컴파일러가 알아서 붙여 줌
	// abstract - 자손이 구현하라는 뜻.
}

class Printer implements Printable { // extends 자리에 implements가 옴
// interface 자리에 있는 걸 구현하라는 뜻. 이 부분이 "자손" 부분
	
	@Override
	public void print(String doc) {

		System.out.println(doc);

	}

}

public class InterfaceTest {

	public static void main(String[] args) {

		Printable printable = new Printer();
		printable.print("Hello world");
	}

}
