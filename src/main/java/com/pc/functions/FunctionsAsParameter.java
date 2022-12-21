package com.pc.functions;

import java.util.function.Function;

public class FunctionsAsParameter {

	public static Integer stringToInt(String s) {
		return Integer.parseInt(s);
	}

	public static Integer sqr(String s) {
		int val = Integer.parseInt(s);
		return val * val;
	}

	public static void convert(Function<String, Integer> fun) {
		System.out.println("FunctionsAsParameter.convert()");
		Integer val = fun.apply("12");
		System.out.println("Val-->" + val);
	}

	public static Function<String, Integer> getSqrFunction() {
		System.out.println("FunctionsAsParameter.getSqrFunction()");
		return FunctionsAsParameter::sqr;
	}

	public static Function<Integer, Integer> getSqrFunSimpleLambda() {
		System.out.println("FunctionsAsParameter.getSqrFunSimpleLambda()");
		return x -> x * x;
	}

	public static Function<String, Integer> getSqrFunLambda() {
		System.out.println("FunctionsAsParameter.getSqrFunLambda()");
		return (x) -> {
			int val = Integer.parseInt(x);
			return val * val;
		};
	}

	public static void main(String[] args) {
		// passing functions as params..
		convert(FunctionsAsParameter::stringToInt);
		convert((s) -> Integer.parseInt(s));

		// return function from another function.
		Function<String, Integer> sqrFun = getSqrFunction();
		Integer sqr = sqrFun.apply("5");
		System.out.println("Sqr val-->" + sqr);
		
		Function<Integer, Integer> sqrFun1 = getSqrFunSimpleLambda();
		Integer sqr1 = sqrFun1.apply(10);
		System.out.println("Sqr val-->" + sqr1);

		Function<String, Integer> sqrFun2 = getSqrFunLambda();
		Integer sqr2 = sqrFun2.apply("20");
		System.out.println("Sqr val-->" + sqr2);
	}
}
