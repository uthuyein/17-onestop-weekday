package com.jdc.mkt;

public class E_MethodOverriding {

}

class Parent{
	ClassB getValue() throws Exception{
		return new ClassB();
	}
}
class Child extends Parent{
	
	@Override
//	child can use unchecked without any exception in parent
//	child also can use sub type of exeception when parent use exception
	 ClassB getValue() throws RuntimeException{
		return (ClassB) new ClassA();
	}
}

class ClassA{}
class ClassB extends ClassA{}
class ClassC extends ClassB{}
