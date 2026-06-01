package com.jdc.mkt;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

public class F_MapInterfaceTest {

	private Map<Integer, String> map;
	
	@Test
	void test() {
		map = new HashMap<Integer, String>();
//		map = new LinkedHashMap<Integer, String>();
//		map = new TreeMap<Integer, String>();
		
		add();
		show("Hash Map");
	}
	
	private void show(String name) {
		System.out.println("==========  "+name +"  =========\n");
		
		for(Entry<Integer,String> e : map.entrySet()) {
			System.out.println("Key : %d   Value : %s "
					.formatted(e.getKey(),e.getValue()));
		}
		
		System.out.println();
	}
	
//	Key can't duplicate
//	TreeMap order by key
	private void add() {
		map.put(3, "CC");
		map.put(5, "EE");
		map.put(2, "BB");
		map.put(1, "GG");
		map.put(4, "DD");
		map.put(6, "CC");
	}
}
