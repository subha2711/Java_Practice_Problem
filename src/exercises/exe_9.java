package exercises;

public class exe_9 {

	public static void main(String[] args) {
		//How to display all the prime numbers between 1 and 100.

		PrimeNum(100);
	}
	
	public static void PrimeNum(int NumUpto) {
		
		int count=0;
		int i;
		System.out.println("The Prime numbers upto "+ NumUpto+ " are: ");
		for( i=1; i<=NumUpto;i++) {
			count =0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					count++;
				}
			if(count == 2) {
				System.out.print(i+" ");
			}
				}
		
			}

}
