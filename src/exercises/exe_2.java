package exercises;

public class exe_2 {

	public static void main(String[] args) {
		
		/*
		 * Given a string of odd length, return the string length 3 from its middle, so
		 * "Candy" yields "and". The string length will be at least 3.
		 * 
		 * middleThree("Candy") → "and"
		 * 
		 * middleThree("and") → "and"
		 * 
		 * middleThree("solving") → "lvi"
		 */
		System.out.println(midVal("Candy"));
		System.out.println(midVal("and"));
		System.out.println(midVal("solving"));
		System.out.println(midVal("solvi"));

	}

		public static String midVal(String oddLenStr) {
			int len =oddLenStr.length()/2;
			if(oddLenStr.length()>3)
				return oddLenStr.substring(len-1, len+2);
			else
				return oddLenStr.substring(0, 3);
		}
}
