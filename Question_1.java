package class_11_03;

class DBox<T1, T2> {
	private T1 ob1;
	private T2 ob2;

	public void set(T1 ob1, T2 ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}

	@Override
	public String toString() {
		return ob1 + " & " + ob2;
	}

}

class DDBox<T1, T2> {
	private T1 ob1;
	private T2 ob2;

	public void set(T1 ob1, T2 ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}

	@Override
	public String toString() {
		return ob1 + "\n" + ob2;
	}

}

public class Question_1 {

	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);

		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);

		DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
		ddbox.set(box1, box2);

		System.out.println(ddbox);
	}
}
/*
 * ================== Apple & 25 Orange & 33
 */
