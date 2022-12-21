package com.pc.optional;

import java.util.Optional;

public class OptionalEx {

	public static Optional<String> getGender(String g) {
		String gender = null;
		if (g.equals("m")) {
			gender = "M";
		} else if (g.equals("f")) {
			gender = "F";
		}
		return Optional.ofNullable(gender);
	}
}
