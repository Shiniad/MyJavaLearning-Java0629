package java0704_����;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("abe");
		list.add("xx");
		// ���ⷽ��
		list.addFirst("000");
		list.removeFirst();
		list.addLast("##");
		System.out.println(list);
	}
}
