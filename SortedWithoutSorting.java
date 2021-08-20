import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
		//This approach works only when the array is sorted 
    //For the case of negative values, we have to check
		// the absolute of the smallest and the lergest to get the maximum value
		// set two pointers, the left (smallest) from 0 and the right (largest)
		int start=0;
		int end=array.length-1;
		int [] square = new int [array.length];
		
		//iterate from the right to left
		for (int index=array.length-1; index>=0; index--) {
				int startValue=array[start];
			  int endValue=array[end];
			  if(Math.abs(startValue) < Math.abs(endValue)) {
					square[index]=endValue*endValue;
					end--;
				}else {
					square[index]=startValue*startValue;
					start++;
				}
		}
		return square;
		
  }
}
