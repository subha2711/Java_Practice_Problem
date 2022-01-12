package exercises;

public class exe_6 {

	public static void main(String[] args) {
//		Write a program to print the pattern given below (Left Triangle Star Pattern)
//
//		*
//
//		* *
//
//		* * *
//
//		* * * *
//
//		* * * * *
		printPattern(5);
		
		
	}	

	public static void printPattern(int n) {
		int i,j;
		for( i=0;i<n;i++) {
			for( j =0; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
}

