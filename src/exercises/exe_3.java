package exercises;

public class exe_3 {

	public static void main(String[] args) {
		/*
		 * Given two strings, append them together (known as "concatenation") and return
		 * the result. However, if the concatenation creates a double-char, then omit
		 * one of the chars, so "abc" and "cat" yields "abcat". conCat("abc", "cat") →
		 * "abcat" conCat("dog", "cat") → "dogcat" conCat("abc", "") → "abc"
		 */

		System.out.println(concCatVal("abca","cat"));
		System.out.println(concCatVal("dogg","gcat"));
		System.out.println(concCatVal("abc",""));
	}

		public static String concCatVal(String val1, String val2) {
		if(val2=="")
		return val1;
		else {
			if(val1.charAt(val1.length()-1)==val2.charAt(0))
				val1=val1.substring(0, val1.length()-1);
		return val1.concat(val2);
		}}
		
}
