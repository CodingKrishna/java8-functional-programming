package com.pc.functions;

import java.util.function.BiFunction;

public class FunctionalCalc {

	public static Integer eval(BiFunction<Integer, Integer, Integer> fun, Integer i1, Integer i2) throws Exception {
		System.out.println("FunctionalCalc.eval()");
		return fun.apply(i1, i2);
	}

	public static Integer add(Integer i1, Integer i2) {
		return i1.intValue() + i2.intValue();
	}

	public static Integer sub(Integer i1, Integer i2) {
		return i1.intValue() - i2.intValue();
	}
	
	public static Integer mul(Integer i1, Integer i2) {
		return i1.intValue() * i2.intValue();
	}
	
	public static void main(String[] args) {
		int val;
		try {
			val = eval(FunctionalCalc::add, 10, 20);
			System.out.println("FunctionalCalc.main() Add Val-->" + val);
			
			val = eval(FunctionalCalc::sub, 10, 20);
			System.out.println("FunctionalCalc.main() Sub Val-->" + val);
			
			val = eval(FunctionalCalc::mul, 10, 20);
			System.out.println("FunctionalCalc.main() Mul Val-->" + val);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
