package Prac;

import java.util.Scanner;

class Word {
	String word;
	int ja = 0;
	int mo = 0;

	Word(String word) {
		this.word = word;
	}

	public void show() {
		for (int i = 0; i <= word.length(); i++) {
		
			switch (word.charAt(i)) {
			case 'a', 'e', 'i', 'o', 'u':
			{mo++;}
				break;
			default: ja++;
				break;

			}
		}
	}
}

public class Count {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("영어로 문자열을 입력하세요.");

		String word = sc.next();
		Word w = new Word(word); //객체생성

		w.show();
	}

}
