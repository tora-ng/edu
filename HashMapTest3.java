package class_11_10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");

		// Key만 담고 있는 커렉션 인스턴스 생성 *** 중요 ***
		Set<Integer> ks = map.keySet();

		// 전체 Key 출력 (for-each문 기반)
		for (Integer n : ks)
			System.out.print(n.toString() + '\t');
		System.out.println();

		// 전체 value 출력 (for-each문 기반)
		for (Integer n : ks)
			System.out.print(map.get(n).toString() + '\t');
		System.out.println();

		// 전체 value 출력 (반복자 기반)
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + "\t");
		System.out.println();
	}

}


// 순차적 정렬
//23	37	45	
//Martin	James	Brown	
//Martin	James	Brown	
