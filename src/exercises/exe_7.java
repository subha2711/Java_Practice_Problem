package exercises;

public class exe_7 {

	public static void main(String[] args) {
		/*
		 * Write a program to print Fibonacci Series up to count 10.
		 * 
		 * Fibonacci Series example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55…
		 */
		FibonacciSeries(10);
	}
public static void FibonacciSeries(int count) {
	
	int num1 = 0;
	int num2 = 1;
	int sum = 0;
	System.out.print("Fibonacci Series upto count "+ count+ " is : ");
			for(int i=1; i<=count;i++) {
				
				System.out.print(sum+" ");
				num1=num2;
				num2 = sum;
				sum = num1 + num2;
			}
	}
}
