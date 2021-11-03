package everyday;

import java.util.Arrays;

class Person1 implements Comparable {
	private String name;
	private int age;

	Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object obj) {
		Person1 person = (Person1) obj;
		// lexicographically : 사전순으로 정렬하라는 것
		int result = this.name.compareTo(person.name); // 내가 기준 - 오름차순
		return result;
	}

	@Override
	public String toString() {
		return name + ": " + age;
	}

}

public class PersonArrTest {

	public static void main(String[] args) {
		Person1[] ar = new Person1[3];

		ar[0] = new Person1("Lee1234", 29);
		ar[1] = new Person1("Goo12", 15);
		ar[2] = new Person1("Soo3", 37);

		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));

	}

}