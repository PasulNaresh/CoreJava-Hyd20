package com.tnsif.basics;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		byte byteMax = 127;
		byte byteMin = -128;
		System.out.println("Min range of byte is" +  byteMin + "Max range of byte is" + byteMax);
		
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println("Min range of short is" + shortMin + "Max range of short is" + shortMax);
		
		int intMax = 2147483647;
		int intMin = -2147483648;
		System.out.println("Min range of int is" + intMin + "Max range of int is" + intMax);
		
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;
		System.out.println("Min range of long is" + longMin + "Max range of long is" + longMax);
		

	}

}
