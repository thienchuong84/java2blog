package com.java2blog.top100javacodinginterview;

import java.util.HashSet;

public class StringAllUniqueCharMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "java2blog";

		System.out.println("Kiem tra chuoi java2blog : " + hasAllUniqueChars("java2blog"));
		System.out.println("Kira tra chuoi java2blog bằng indexof và lastindexof : " + hasUniqueCharsUseIndexOd(word));
		
		/*
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			System.out.println("char : " + c + " - indexOf : " + word.indexOf(c) + " - lastIndexOf : " + word.lastIndexOf(c));
		}
		*/
		
	}
	
	public static boolean hasAllUniqueChars(String word) {
		HashSet alphaSet = new HashSet();
		
		for(int i = 0; i < word.length(); i++) {

			char c = word.charAt(i);
			System.out.println(c);
			
			if(!alphaSet.add(c))
				return false;
		}
		
		return true;
	}
	
	public static boolean hasUniqueCharsUseIndexOd(String word) {
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if(word.indexOf(c) != word.lastIndexOf(c))
				return false;
		}
		
		return true;
	}

}
