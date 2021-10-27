package class_10_27;


interface Printable {
	void printLine(String str);
}

class SimplePrinter implements Printable {
	public void printLine(String str) {
		System.out.println(str);
	}
}

class MultiPrinter extends SimplePrinter {
	public void printLine(String str) {
		super.printLine("start of multi...");
		super.printLine(str);
		super.printLine("end of multi");
	}
}

interface Sea {
}

interface Ground {
}

interface Locable {
	void printLive();
}

class Fish implements Locable, Sea {

	@Override
	public void printLive() {
		System.out.println("¹Ù´Ù¿¡ »ð´Ï´Ù.");
	}
}

class Tiger implements Locable, Ground {

	@Override
	public void printLive() {
		System.out.println("À°Áö¿¡ »ð´Ï´Ù.");
	}
}

class InstanceofInterface {

//ÇÔ¼ö·Î »« °Í
	public static void checkLocation(Locable loc) { //Locable loc ¿©±â¿¡ Locable loc1 ³ÖÀ½
		
		if (loc instanceof Sea) {
			System.out.println("¹Ù´Ù¿¡ »ð´Ï´Ù.");
		} else if (loc instanceof Ground) {
			System.out.println("À°Áö¿¡ »ð´Ï´Ù.");
		} else {
			System.out.println("ÇÏ´Ã¿¡ »ì°ÚÁö");
		}
	
	}
	
	public static void main(String[] args) {
		Locable loc1 = new Fish();
		Tiger tiger = new Tiger();

		checkLocation(loc1);
		checkLocation(tiger);

	}
}