package com.jdc.mkt;

public class Main {

//	Every character might use:"Arial", 12, false
	public static void main(String[] args) {
		Character character = new Character('A');
		character.properties();
	}
}

class Character{
	private char value;
	private CharacterStyle style = new CharacterStyle("Arial", 12, false);
	
	public Character(char value) {
		super();
		this.value = value;	
	}
	
	void properties() {
		System.out.println("'"+value+"'"+style.toString());
	}	
}

class CharacterStyle{
	private String font;
	private int size;
	private boolean bold;
	
	public CharacterStyle(String font, int size, boolean bold) {
		super();
		this.font = font;
		this.size = size;
		this.bold = bold;
	}
	
	@Override
	public String toString() {
		return " character is with font :"+font+", size :"+size+", bold :"+bold;
	}
	
	
}
