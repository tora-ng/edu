package class_11_03;

class Box3<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

public class WrapperGenericTest {

	public static void main(String[] args) {
		Box3<Integer> iBox3 = new Box3<Integer>();
		iBox3.set(125); // 오토 박싱 진행
		int num = iBox3.get(); // 오토 언박싱 진행
		System.out.println(num);
	}

}
//Box3<int> box = new Box3<int>();에서 타입 매개변수에는 기본 자료형이 올 수 없다. 참조형만 가능