package class_11_10;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Test {

	public static void main(String[] args) {
		Deque<String> deq = new ArrayDeque<>();

		deq.offerFirst("1.Box");
		deq.offerFirst("2.Toy");
		deq.offerFirst("3.Robot");

		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());

	}

}

//스택은 먼저 넣은 게 먼저 나오지만, Deque를 사용하면 나중에 넣은 것을 먼저 뺄 수 있다.