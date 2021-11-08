package class_11_08;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		// 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");

		// 반복자 획득
		Iterator<String> itr = list.iterator(); // iterator는 반복자, 화살표다.

		// 반복자를 이용한 순차적 참조
		while (itr.hasNext()) // hasNext() 안에 list.add()에 있는 값들이 있나 확인을 함 그리고 있으면 true고, itr.next()를 찍는다.
			System.out.print(itr.next() + '\t'); // next()를 호출하면서 옆으로 감
		System.out.println();

		// 반복자 다시 획득
		itr = list.iterator(); // 이미 끝까지 가있는 iterator(화살표)를 이동하면 처음으로 돌아가는 것임

		// "Box"의 삭제
		String str;
		while (itr.hasNext()) {
			str = itr.next();

			if (str.equals("Box")) // "Box"를 찾을 때, iterator를 쓰는 게 훨씬 좋은 것이다.
				itr.remove(); // 삭제
		}

		// 반복자 다시 획득
		itr = list.iterator();

		// 삭제 후 결과 확인
		while (itr.hasNext())
			System.out.print(itr.next() + '\t');

		System.out.println();

	}

}
