package com.jdc.mkt;

public class Main {

	public static void main(String[] args) {
		Folder child1 = new Folder("Documents 1");
		child1.add(new File("file 1"),new File("file 2"),new File("file 3"));
		
		Folder child2 = new Folder("Documents 2");
		child2.add(new File("file 1"),new File("file 2"));
		
		Folder parent = new Folder("Parent");
		parent.add(child1,child2);
		
		parent.display();
	}
}
