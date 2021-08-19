import java.util.*;

class Program {
  // O(n^2) time | O(1) space.
  public static int[] twoNumberSum(int[] array, int targetSum) {
		int [] arr = new int [2];
		if (array.length<2) return new int [0];
		outerloop:
		for (int i=0; i<array.length; i++) {
			for (int j=i+1; j<array.length;j++) {
				int sum=array[i] + array[j]; 		
				if(i==array.length-2 && sum!=targetSum ){return new int [0];} 
				if(sum == targetSum) {
					arr[0] = array[i];
					arr[1] = array[j];
					break outerloop;
				}
			}
		}
		//System.out.println("Hello");
    return arr;
  }
}

