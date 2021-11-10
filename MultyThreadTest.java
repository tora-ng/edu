package class_11_10;

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
		}
	}// run()
}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("|");
		}

	}// run()
}

public class MultyThreadTest {

	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();

		th1.start();
		th2.start();

	}

}
