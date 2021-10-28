package class_10_28;
class Board{
	
}
class PBoard extends Board{
	
}


public class ClassCastException {

	public static void main(String[] args) {
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard)pbd1;
		
		System.out.println("...intermediate locationd...");
		Board ebd1 = new Board();
		PBoard ebd2 = (PBoard)ebd1; //Exception!

		String str = null;
		System.out.println(str);
		int len = str.length();
	}

}

//실시간에러
