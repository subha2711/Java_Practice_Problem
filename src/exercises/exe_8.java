package exercises;

import java.util.Arrays;

public class exe_8 {

	public static void main(String[] args) {
		// Find The Largest Value From The Given Array.
		
		int[] a= {130,12,1234,32,243,9,3,4,4,43,3};
		System.out.println(LarArrVal(a));
	}
	public static int  LarArrVal(int[] arr) {
	
		int max=arr[0];
		for( int i =0; i<arr.length;i++) {
			for(int j= i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					max=arr[i];
					arr[i]=arr[j];
					arr[j]=max;
				}	
			}
			
		}
		Arrays.sort(arr);
		System.out.println("Largest value using Arrays.sort is "+( arr[arr.length-1]));
		return max;
		}
}
