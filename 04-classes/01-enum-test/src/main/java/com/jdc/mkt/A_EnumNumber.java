package com.jdc.mkt;

public enum A_EnumNumber implements Checker{

	ONE(1) {
		@Override
		public String getFullName() {
			return "Number One";
		}
		@Override
		public void check() {
			System.out.println("checking one");
		}
		
	},
	TWO(2){
		@Override
		public String getFullName() {
			return "Number Two";
		}
		@Override
		public void check() {
			System.out.println("checking two");
		}
	}, 
	THREE(3){
		@Override
		public String getFullName() {
			return "Number Three";
		}
		@Override
		public void check() {
			System.out.println("checking with three");
		}
		
	};
	
//	@Override
//	public void check() {
//		System.out.println("checking test");
//	}

//	will create anonymous class and add implement method in each constant.
	public abstract String getFullName();

//	private modifier only in constructor
//	If there have args(int num) , each constant need to add ONE(1)
	private A_EnumNumber(int num) {
		this.num = num; 
	}
	
//  can use any access modifier in method
	public int getNum() {
		return num;
	}
	
//  can use any access modifier in variable
	private int num;


}
