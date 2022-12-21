package com.pc.optional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionalExTest {
	
	@Test
    void test() {
		String gender = OptionalEx.getGender("f/m").orElse("unknown");
		assertEquals("unknown", gender);
		
		OptionalEx.getGender("unknown").ifPresent(val -> {
			assertTrue(true, val);
		});
    }
}
