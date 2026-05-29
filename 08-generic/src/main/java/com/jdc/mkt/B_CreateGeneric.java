package com.jdc.mkt;

@SuppressWarnings("unused")
public class B_CreateGeneric {
	
	public static void main(String[] args) {
		Human<String> human = new Human<>();
		Checker<String>checker = new Checker<>("ss");
		
		useData("hello");
		String s = getData();
	}
	
	static<T> void useData(T t) {
		System.out.println(t);
	}
	
	static <R> R getData() {
		return null;
	}
}

record Checker<T>(T t) {}

interface Pair<K,V>{
	void setKey(K k);
	void setValue(V v);
}

class OrderPair<X,Y> implements Pair<X,Y>{

	@Override
	public void setKey(X k) {
		
	}

	@Override
	public void setValue(Y v) {
		
	}
	
}

class Human<T>{
	
}
