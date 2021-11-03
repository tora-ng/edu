//package class_11_03;
//
//class DBox<L, R> {
//	private L left;
//	private R right;
//
//	public void set(L o, R r) {
//		left = o;
//		right = r;
//	}
//
//	@Override
//	public String toString() {
//		return left + " & " + right;
//	}
//}
//
//public class GenericTest2 {
//
//	public static void main(String[] args) {
//		DBox<String, Integer> box = new DBox<String, Integer>(); // 데이터 타입: DBox<String, Integer>
//		box.set("Apple", 25);
//		System.out.println(box);
//
//		DBox<String, String> box2 = new DBox<String, String>();
//		box2.set("Apple", "Orange"); // 타입 두 개가 다 String이기 때문에 " "로 문자열이 들어가야 한다.
//		System.out.println(box2);
//
//	}
//}
