package java0704;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("abe");
		list.add("xx");
		// ÌØÊâ·½·¨
		list.addFirst("000");
		list.removeFirst();
		list.addLast("##");
		System.out.println(list);
	}
}
