package exercises;

public class exe_10 {

	public static void main(String[] args) {
		//Take in a String from user and take in a character from user.
		//Once you get them, print out how many times 
		//the given character is present in the given String.

	System.out.println("Number of time "
	+ "the given character present in the string is "+ CharPresent("subha",'l'));
	}

		public static int CharPresent(String val, char present ) {
			
			int count=0;
			char[] valArr =val.toCharArray();
				for(char e :valArr) {
					if(present==e)
						count++;
				}
			
			return count;
		}
}
