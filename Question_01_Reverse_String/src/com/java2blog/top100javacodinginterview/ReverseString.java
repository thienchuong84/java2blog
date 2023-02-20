package com.java2blog.top100javacodinginterview;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String blogName = "java2blog";
		
		System.out.println(blogName);		
		
		System.out.println("String after reverse use loop for: " + forReverseString(blogName));
		
		System.out.println("String after reverse use StringBuffer : " + reverseBufferString(blogName));

	}
	
	// Cách 1 dùng for loop
	public static String forReverseString(String word) {
		String reverse = "";
		
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		
		return reverse;
	}

	// Cách 2 dùng String buffer
	public static StringBuffer reverseBufferString(String word) {
		StringBuffer sb = new StringBuffer(word);
		return sb.reverse();
		
	}
}
