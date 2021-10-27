//package class_10_27;
//
//interface Printable { // 자손이 다 불러내야 함
//	void print(String doc);
//}
//
//interface ColorPrintable extends Printable {
//	void printCMYK(String doc);
//}
////interface를 상속받은 것
//
//// ===================================
//// ^ OS가 부여하는 것
//
//class Prn909Drv implements ColorPrintable {
//	@Override
//	public void print(String doc) {
//		System.out.println("From MD-909 black & white ver");
//		System.out.println(doc);
//	}
//
//	@Override
//	public void printCMYK(String doc) {
//		System.out.println("From MD-909 printCMYK");
//		System.out.println(doc);
//	}
//}
//
//public class InterfaceExtends {
//
//	public static void main(String[] args) {
//		String myDoc = "This is a report about...";
//
//		ColorPrintable prn = new Prn909Drv();
//		prn.print(myDoc);
//
//		System.out.println();
//		prn.printCMYK(myDoc);
//
//	}
//
//}
