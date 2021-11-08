package class_11_08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		System.out.println("인스턴스 수: " + set.size());

		// 반복자를 이용한 전체 출력
		for (Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();

		// for-each문을 이용한 전체 출력
		for (String s : set)
			System.out.print(s + '\t');
		System.out.println();

	}

}
//set<E>는 '집합'이기 때문에 중복 허용을 안 한다.
//로또 번호 구현할 때 사용하기 편하다