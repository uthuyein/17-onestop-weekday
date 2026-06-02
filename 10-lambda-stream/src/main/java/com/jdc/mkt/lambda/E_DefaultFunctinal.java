package com.jdc.mkt.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class E_DefaultFunctinal {

	public static void main(String[] args) {
		useConsumer(23, 30);
		
		System.out.println();
		usePredicate(19);
		
		System.out.println();
		useFunction(5);
		
	}
	
	static void useFunction(int value) {
		Function<Integer, Integer> f = x -> x + 3;
		Function<Integer, Integer> f1 = x -> x * x;
		Function<Integer, Integer> combine = f.andThen(f1);
		System.out.println("Use AndThen :: "+combine.apply(value));
		
		Function<String, Integer> r = Integer :: parseInt ;
		System.out.println(r.apply("34"));
		
		BiFunction<Integer, Integer, String> b = (x,y) -> "Result :"+(x+y);
		System.out.println(b.apply(20, 30));
	}
	
	static void useOperator() {
		UnaryOperator<String> o = a -> "use : "+a;
		System.out.println(o.apply("unary"));
		
		BinaryOperator<String> b = (x,y) -> "Use : "+x+y;
		System.out.println(b.apply("binary"," operator"));
	}
	
	static void useSupplier() {
		Supplier<Integer> s = () -> 30;
		System.out.println(s.get());
	}
	
	static void usePredicate(int value) {
		Predicate<Integer> p1 = a -> a > 0;
		Predicate<Integer> p2 = a -> a < 10;
		Predicate<Integer> p3 =  p1.or(p2).negate();
		System.out.println("Value is greater than 0 and/or less than 10 :: "+p3.test(value));
		
		
		BiPredicate<Integer, Integer> bp = (a,b) -> a%b == 0;
		System.out.println(bp.test(10, 2));
	}
	
	
	static void useConsumer(int a, int b) {
		Consumer<Integer> c1 = x ->  System.out.println("Divided by 2 :: "+(x%2));
		Consumer<Integer> c2 = y -> System.out.println("y is greater than 10 :: "+(y > 10));
		Consumer<Integer> combine = c1.andThen(c2);
		combine.accept(a);
		
		
		BiConsumer<Integer,Integer> c3 = (x,y) -> System.out.println("Use biconsumer ::: "+(x+y));
		c3.accept(a,b);
		
		
		
	}
}
