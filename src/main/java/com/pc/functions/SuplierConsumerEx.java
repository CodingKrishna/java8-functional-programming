package com.pc.functions;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SuplierConsumerEx {

	public static String getWelcomeMage() {
		return "Hi welcome to Java8";
	}

	public static void printStr(String str) {
		System.out.println("SuplierConsumerEx.printStr() ::" + str);
	}

	public static Supplier<String> funSuplierStr() {
		return () -> "Hii";
	}

	public static Supplier<String> funSuplier() {
		return SuplierConsumerEx::getWelcomeMage;
	}

	public static void consumeFun(Consumer<String> consFun) {
		System.out.println("SuplierConsumerEx.consumeFun()");
		consFun.accept("Ravi for Consumer Fun");
	}

	public static void main(String[] args) {
		
	}

}
