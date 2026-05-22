package com.jdc.mkt.seal;

public class B_SealedDemoTwo {

}

sealed interface Worker permits Manager,Officier{
	void work();
}

//Only can use from non-sealed when permitted
non-sealed interface Manager extends Worker{}
non-sealed interface Officier extends Worker{}

interface Owner extends Manager{}
