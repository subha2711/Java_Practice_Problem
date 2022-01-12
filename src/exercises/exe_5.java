package exercises;

public class exe_5 {

	public static void main(String[] args) {
		/*Given an int array, return true if the array contains 2 twice, or 3 twice.
		 *  The array will be length 0, 1, or 2.

				double23([2, 2]) → true

				double23([3, 3]) → true

				double23([2, 3]) → false}*/
		int[]d = {2,3};
		System.out.println(double23(d));

	}
	public static boolean double23(int[]smeElem2or3) {
		
			if(smeElem2or3.length>1 &&
					(smeElem2or3[0]==2&&smeElem2or3[1]==2 
					||(smeElem2or3[0]==3 &&smeElem2or3[1]==3)))
				return true;
			else
		return false;
	}
}
