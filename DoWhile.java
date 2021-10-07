
public class DoWhile {

	public static void main(String[] args) {

		//do ~ while문은 반드시 do {}안의 내용을 한 번은 실행한다
		int num = 0;

		do {
			System.out.println("I like Java" + num);
			num ++;
		} while(num < 5);

	}

}
