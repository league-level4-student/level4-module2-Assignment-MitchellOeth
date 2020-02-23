package StringMethods;

import java.util.Arrays;
import java.util.Base64;

/*
Visit the JavaDocs for the String class to view everything you can do with a String.  


HINT:  Here are some String methods you might find useful 
contains
replace
trim
length
getBytes
endsWith
split
indexOf
lastIndexOf
compareTo(IgnoreCase)
substring


Here are some Character methods you might find useful:
Character.toLowerCase(char c);
Character.isLetter(char c);
Character.isDigit(char c);
Character.getNumericValue(char c);
 */

public class StringMethods {

	// Given Strings s1 and s2, return the longer String
	public static String longerString(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return s1;
		}
		return s2;
	}

	
	// if String s contains the word "underscores", change all of the spaces to underscores
	public static String formatSpaces(String s) {
		if (s.contains("underscores") == true) {
//Not Done
			s.replace(' ', '_');
		}
		return s;
	}

	
	// Return the name of the person whose LAST name would appear first if they were in alphabetical order
	// You cannot assume there are no extra spaces around the name, but you can
	// assume there is only one space between the first and last name
	public static String lineLeader(String s1, String s2, String s3) {
// Confused
		
		
		
		
//		for (int i = 0; i < s1.length(); i++) {
//			if (s1.charAt(i) == ' ' && s1.charAt(i-1) != ' ' && s1.charAt(i+1) != ' ') {
//				
//			}
//		}
		char a = ' ';
		for (int i = 1; i < s1.length()-1; i++) {
			if (s1.charAt(i) == ' ' && s1.charAt(0) == ' ') {
				s1 = s1.substring(1);
			}
			if (s1.charAt(i) == ' ' && s1.charAt(i-1) != ' ' && s1.charAt(i+1) != ' ') {
				a = s1.charAt(i+1);
			}
		}
		char b = ' ';
		for (int i = 1; i < s2.length()-1; i++) {
			if (s2.charAt(i) == ' ' && s2.charAt(0) == ' ') {
				s2 = s2.substring(1);
			}
			if (s2.charAt(i) == ' ' && s2.charAt(i-1) != ' ' && s2.charAt(i+1) != ' ') {
				b = s2.charAt(i+1);
			}
		}
		char c = ' ';
		for (int i = 1; i < s3.length()-1; i++) {
			if (s3.charAt(i) == ' ' && s3.charAt(0) == ' ') {
				s3 = s3.substring(1);
			}
			if (s3.charAt(i) == ' ' && s3.charAt(i-1) != ' ' && s3.charAt(i+1) != ' ') {
				c = s3.charAt(i+1);
			}
		}
		if (Character.getNumericValue(a) < Character.getNumericValue(b) && Character.getNumericValue(a) < Character.getNumericValue(c)) {
			System.out.println(s1);
			return s1;
		} else if (Character.getNumericValue(b) < Character.getNumericValue(c) && Character.getNumericValue(b) < Character.getNumericValue(a)) {
			System.out.println(s2);
			return s2;
		} else if (Character.getNumericValue(c) < Character.getNumericValue(b) && Character.getNumericValue(c) < Character.getNumericValue(a)) {
			System.out.println(s3);
			return s3;
		}

		return null;
	}
	
	
	// Return the sum of all numerical digits in the String
	public static int numeralSum(String s) {
		int a = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 1) {
				a += 1;
			}
			if (s.charAt(i) == 2) {
				a += 2;
			}
			if (s.charAt(i) == 3) {
				a += 3;
			}
			if (s.charAt(i) == 4) {
				a += 4;
			}
			if (s.charAt(i) == 5) {
				a += 5;
			}
			if (s.charAt(i) == 6) {
				a += 6;
			}
			if (s.charAt(i) == 7) {
				a += 7;
			}
			if (s.charAt(i) == 8) {
				a += 8;
			}
			if (s.charAt(i) == 9) {
				a += 9;
			}
		}
		return a;
	}
	
	
	// Return the number of times String substring appears in String s
	public static int substringCount(String s, String substring) {
		return 0;
	}

	// Call Utitilities.encrypt to encrypt String s
	public static String encrypt(String s, char key) {
		return null;
	}

	// Call Utilities.decrypt to decrypt the cyphertext
	public static String decrypt(String s, char key) {
		return null;
	}


	// Return the number of words in String s that end with String substring
	// You can assume there are no punctuation marks between words
	public static int wordsEndsWithSubstring(String s, String substring) {
		return 0;
	}
	

	// Given String s, return the number of characters between the first occurrence
	// of String substring and the final occurrence
	// You can assume that substring will appear at least twice
	public static int distance(String s, String substring) {
		return 0;
	}


	// Return true if String s is a palindrome
	// palindromes are words or phrases are read the same forward as backward.
	// HINT: ignore/remove all punctuation and spaces in the String
	public static boolean palindrome(String s) {
		return true;
	}
	
}

class Utilities {
	// This basic encryption scheme is called single-byte xor. It takes a single
	// byte and uses exclusive-or on every character in the String.
	public static String encrypt(byte[] plaintext, byte key) {
		for (int i = 0; i < plaintext.length; i++) {
			plaintext[i] = (byte) (plaintext[i] ^ key);
		}
		return Base64.getEncoder().encodeToString(plaintext);
	}

	public static String decrypt(String cyphertext, byte key) {
		byte[] b = Base64.getDecoder().decode(cyphertext);
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) (b[i] ^ key);
		}
		return new String(b);
	}
}
