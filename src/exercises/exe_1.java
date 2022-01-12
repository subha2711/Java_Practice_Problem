package exercises;

public class exe_1 {

	public static void main(String[] args) {
		
		/*
		 * Given a string and an index, return a string length 2 starting at the given
		 * index. If the index is too big or too small to define a string length 2, use
		 * the first 2 chars. The string length will be at least 2.
		 * 
		 * twoChar("java", 0) → "ja"
		 * 
		 * twoChar("java", 2) → "va"
		 * 
		 * twoChar("java", 3) → "ja"
		 */
		System.out.println(exe1("java",2));
	}

	
	public static String exe1(String val, int index) {
		
		
	if( index>=val.length()-1)
		return val.substring(0,2);
	else
		return val.substring(index,index+2);
	}
}
