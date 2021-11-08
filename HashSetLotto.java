package class_11_08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();

		while (set.size() != 6) {
			int rNum = (int) (Math.random() * 45 + 1);
			set.add(rNum);
		}

		// 출력
		for (Integer num : set)
			System.out.print(num + "\t");

		System.out.println();

//		while (true) {
//			if (set.size() < 6) {
//				set.add((int) (Math.random() * 45 + 1));
//			} else {
//				for (Integer n : set)
//					System.out.print(n + "\t");
//				System.out.println();
//				break;
//			}
//		}

	}

}
