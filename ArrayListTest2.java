package class_11_05;

import java.util.LinkedList;
import java.util.List;

class MyLinkedList {
	int num;
	MyLinkedList my;
}

public class ArrayListTest2 {

	public static void main(String[] args) {
		MyLinkedList list1 = new MyLinkedList();
		MyLinkedList list2 = new MyLinkedList();
		MyLinkedList list3 = new MyLinkedList();
		
		list1.num = 10;
		
		list1.my = list2;
		list2.my = list3;
		
	}

}
