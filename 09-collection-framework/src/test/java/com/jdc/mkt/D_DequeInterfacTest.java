package com.jdc.mkt;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

public class D_DequeInterfacTest {

	private Deque<String> deque;
	
	@Test
	void test() {
//		deque = new LinkedList<>();
		deque = new ArrayDeque<String>();
		
		add("ArrayDeque");
		show();
		
		remove("ArrayDeque");
		show();
	}
	
	void show() {
		System.out.println();
		for(String s:deque) {
			System.out.println("Element ::: "+s);
		}
		System.out.println();
		System.out.println("============= End =============");
	}
	
	void remove(String name) {
		System.out.println("============= "+name+" =============");
		deque.removeLast();
		deque.removeFirst();
		
	}
	
	void add(String name) {
		System.out.println("============= "+name+" =============");
		deque.addLast("GG");
		deque.add("DD");
		deque.addFirst("SS");
		deque.add("BB");
		deque.add("AA");
		
	}
}
