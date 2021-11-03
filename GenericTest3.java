package class_11_03;

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

public class GenericTest3 {

	public static void main(String[] args) {
		   Box<String> sBox = new Box<>();
		   sBox.set("I am so happy.");
		   
		   Box<Box<String>> wBox = new Box<>();
		   wBox.set(sBox);

		   Box<Box<Box<String>>> zBox = new Box<>();
		   zBox.set(wBox);

		   System.out.println(zBox.get().get().get());
		//zBox의 get()을 하게 되면 wBox가 호출된다.
		//wBox의 get()을 하게 되면 sBox가 호출된다.
		//sBox의 get()을 하게 되면 "I am so happy"가 호출된다.
	}
}
