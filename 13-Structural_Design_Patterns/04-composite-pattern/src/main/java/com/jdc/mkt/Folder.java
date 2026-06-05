package com.jdc.mkt;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
	
	private String name;
	private List<FileSystemItem> lists = new ArrayList<FileSystemItem>();
	
	public Folder(String name) {
		this.name = name;
	}
	
	public void add(FileSystemItem... items) {
		lists.addAll(List.of(items));
	}

	@Override
	public void display() {
		System.out.println("Print ::"+name);
		
		for(FileSystemItem item : lists) {
			item.display();
		}
	}

}
