package com.kobe.common;

/**
 * packageName    : com.kobe.common
 * fileName       : TypeCheck
 * author         : kobe
 * date           : 2025. 8. 25.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 25.        kobe       최초 생성
 */
public class TypeCheck {
	public static Class<Integer> typeof(final int expr) {
		return Integer.TYPE;
	}

	public static Class<Long> typeof(final long expr) {
		return Long.TYPE;
	}

	public static Class<Float> typeof(final float expr) {
		return Float.TYPE;
	}

	public static Class<Double> typeof(final double expr) {
		return Double.TYPE;
	}

	public static Class<String> typeof(final String expr) {
		return String.class;
	}

	public static Class<Boolean> typeof(final boolean expr) {
		return Boolean.class;
	}

	public static Class<?> typeof(final Object expr) {
		return expr.getClass();
	}
}
