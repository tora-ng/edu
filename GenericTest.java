//package class_11_03;
//
//class Apple2 {
//	@Override
//	public String toString() {
//		return "I am an apple";
//	}
//}
//
//class Orange2 {
//	@Override
//	public String toString() {
//		return "I am an orange";
//	}
//}
//
//class Box1<T> {
//	private T ob;
//
//	public void set(T o) { //(Apple2 o) 가 되기 때문에 o 안에 다른 걸 넣으면 에러가 뜬다.
//		ob = o;
//	}
//
//	public T get() {
//		return ob;
//	}
//}
//
////Apple2는 이렇게 메모리에 올라간다.
////class Box1 {
////	private Apple2 ob;
////
////	public void set(Apple2 o) {
////		ob = o;
////	}
////
////	public Apple2 get() {
////		return ob;
////	}
////}
//
//// 지네릭 문법이 만들어져서 자바 1.5부터는 예전에 다형성 적용(Object)으로 인한
////  형변환 및 실시간 에러 등을 컴파일 에러로 잡아낼 수 있게 됐다.
//
//// 과거 실시간 에러를 컴파일 에러로 잡아낼 수 있는 이유는?
//// -> 데이터 타입을 미리 정하고 들어가기 때문에 잡아낼 수 있다. (지네릭 문법을 사용하는 이유)
//
//public class GenericTest {
//
//	public static void main(String[] args) {
//		// 데이터 타입 다름 메모리에 올라가는 코드를 확인. 타입이 다름!!!!!
//		Box1<Apple2> aBox = new Box1<Apple2>(); // Box1의 Apple2형
//		Box1<Orange2> oBox = new Box1<Orange2>();// Box1의 Orange2형
//
//		// 과일을 박스에 담는다.
//		// aBox.set("apple");은 들어가지 않는다. 컴파일 에러를 내 줌
//		// 이전에는 ( ) 안에 온갖 타입들이 다 들어갔는데 이제는 아무거나 넣을 수 없음
//		// 미리 타입을 정해 두기 때문에 그 이외의 것들은 에러를 낸다.
//		aBox.set(new Apple2());
//		oBox.set(new Orange2());
//
//		// 박스에서 과일을 꺼내는데 형 변환 하지 않는다.
//		// 자기 걸로 이미 선언되어서 들어가 때문에 형변환이 안 필요하다.
//		Apple2 ap = aBox.get();
//		Orange2 og = oBox.get();
//
//		System.out.println(ap);
//		System.out.println(og);
//	}
//}
