package com.jdc.mkt.seal;

public class A_SealedDemo {

	public  void use() {
		ClassB b = new ClassB();
		b.doSomething();
	}	
}

sealed class ClassA permits ClassB,ClassC,ClassD{
	public void doSomething() {
		System.out.println("Do something from class a.");
	}
}

final class  ClassB extends ClassA{}

non-sealed class ClassC extends ClassA{}

//Non-sealed (ClassC) can be inherited from simple class(ClassNonSealedUsed)
class ClassNonSealedUsed extends ClassC{}

sealed class ClassD extends ClassA permits ClassE{}
final class ClassE extends ClassD{}











