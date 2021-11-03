//// 지네릭 이전의 코드
//
//package class_11_03;
//
//class Apple {
//	@Override
//	public String toString() {
//		return "I am an apple.";
//	}
//}
//
//class Orange {
//	@Override
//	public String toString() {
//		return "I am an orange.";
//	}
//}
//
//class Box {
//	private Object ob;
//
//	void set(Object o) {
//		ob = o;
//	}
//
//	Object get() {
//		return ob;
//	}
//}
//
//public class GenericTestBefore {
//
//	public static void main(String[] args) {
//		// 과일 담는 박스 생성
//		Box aBox = new Box();
//		Box oBox = new Box();
//
//		// 과일을 박스에 담는다. 아래 두 문장에서는 사과와 오렌지가 아닌 '문자열'을 담았다.
//		// 에러가 안 나옴
//		aBox.set(new Apple());
//		oBox.set(new Orange());
//
//		// 박스에서 과일을 꺼낸다.
//		Apple ap = (Apple) aBox.get(); // 반드시 형변환
//		Orange og = (Orange) oBox.get();
//
//		System.out.println(ap);
//		System.out.println(og);
//
//		/*
//		 * Box aBox = new Box(); Box oBox = new Box();
//		 * 
//		 * // 아래 두 문장에서는 사과와 오렌지가 아닌 '문자열'을 담았다. (문제 문장) aBox.set("Apple"); oBox.set("Orange");
//		 * 
//		 * // 상자에 과일이 담기지 않았는데 과일을 꺼내려 한다. Apple ap = (Apple)aBox.get(); Orange og =
//		 * (Orange)oBox.get();
//		 * 
//		 * System.out.println(ap); System.out.println(og); }
//		 */
//
//	}
//
//}
