package Prac;

import java.util.Scanner;

public class Mun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char ch = "ABCD".charAt(0);

		for (int i = word.length() -1; i >= 0; i--) {
			System.out.print(word.charAt(i));

		}
	}

}
//ABCD 입력하면 DCBA 출력되게 하기
//length는 길이, 제일 마지막  charAt()에는 마지막 값을 넣음.