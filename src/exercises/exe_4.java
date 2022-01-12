package exercises;

import java.util.Arrays;

public class exe_4 {

	public static void main(String[] args) {
		/*
		 * Given an array of ints of odd length, return a new array length 3 containing
		 * the elements from the middle of the array. The array length will be at least
		 * 3.
		 * 
		 * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
		 * 
		 * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
		 * 
		 * midThree([1, 2, 3]) → [1, 2, 3]
		 */

			int[]a= {1,2,3,4,5};
			int[]b= {8, 6, 7, 5, 3, 0, 9};
			int[]c= {1, 2, 3};
			System.out.println("array a= "+Arrays.toString(midElem(a)));
			System.out.println("array b= "+Arrays.toString(midElem(b)));
			System.out.println("array c= "+Arrays.toString(midElem(c)));
	}

	public static int[] midElem(int[] oddLenArr) {
		int[] newArr = new int[3];
		int len =oddLenArr.length/2;
			newArr[0]= oddLenArr[len-1];
			newArr[1]=oddLenArr[len];;
			newArr[2]=oddLenArr[len+1];;

		return newArr;
	}
}
