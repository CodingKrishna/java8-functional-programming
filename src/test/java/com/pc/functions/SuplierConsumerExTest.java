package com.pc.functions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

public class SuplierConsumerExTest {

	
	@Test
    void test() {
		Supplier<String> supFun = SuplierConsumerEx.funSuplier();
		String supFunVal = supFun.get();
		assertEquals("Hi welcome to Java8", supFunVal);

		Supplier<String> supFun1 = SuplierConsumerEx.funSuplierStr();
		String supFunVal1 = supFun1.get();
		assertEquals("Hii", supFunVal1);

		SuplierConsumerEx.consumeFun(SuplierConsumerEx::printStr);
    }
}
