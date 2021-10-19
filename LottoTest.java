public class LottoTest {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			
			//중복 제거 로직
			for(int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					System.out.println("중복값: " + lotto[i]);
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}

	}

}
/*
 * >> 로또 번호 구하기 << 1. int 담는 6개의 배열 선언 2. 각각의 배열에 랜덤으로 1~45 3. 중복 제거해서 6개를 출력
 */