package class_11_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Array_Set_List_Test {

	public static void main(String[] args) {
		List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
		ArrayList<String> list = new ArrayList<>(lst);

		for (String s : list)
			System.out.print(s.toString() + '\t');
		System.out.println();

		// 중복된 인스턴스를 걸러내기 위한 작업
		HashSet<String> set = new HashSet<String>(list);

		// 원래대로 ArrayList<String> 인스턴스로 저장물을 옮긴다.
		list = new ArrayList<>(set);

		for (String s : list)
			System.out.print(s.toString() + '\t');
		System.out.println();
	}

}

//set과 list는 서로 자유자재로 바꿀 수 있다.
//증복된 인스턴스의 삭제