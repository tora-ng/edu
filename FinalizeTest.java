package class_10_28;

class Person {
	String name;
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("destroyed: " +name);
	}
}
public class FinalizeTest {

	public static void main(String[] args) {
		Person p1 = new Person("YOON");
		Person p2 = new Person("Park");
		
		p1 = null;
		p2 = null;
		
		System.out.println("end of program");
	}

}
