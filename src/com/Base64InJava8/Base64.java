package com.Base64InJava8;
public class Base64 {
// Binary to text encoding
// way 	of preserving special characters while transferring text
// takes three characters of input and produces four characters of output
// package java.util.Base64;
// Contains static methods for getting encoders and decoders
// Encoders and Decoders contain methods for encoding and decoding	
// 
	public static void main(String[] args) {
		String encoded = java.util.Base64.getEncoder().encodeToString("Anand".getBytes());
		System.out.println(encoded);
		
		String encoded2 = "QW5hbmQ=";
		String decoded = new String(java.util.Base64.getDecoder().decode(encoded2));
		System.out.println(decoded);
	}

}
