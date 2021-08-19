import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    //First approach
    // O(n) time which the length of the main array | O (1) space. 
		int seqIndex=0;
		int arrayIndex=0;
		
		while(arrayIndex<array.size() && seqIndex<sequence.size()){
			if(array.get(arrayIndex).equals(sequence.get(seqIndex))){
				seqIndex++; //if the element of subsequence is found in the main list
			}
			arrayIndex++;
		}
		return seqIndex==sequence.size();
  }
  
public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    //Second approach
    // O(n) time which the length of the main array | O (1) space. 
		int seqIndex=0;
		for (int i=0; i<array.size(); i++){
			if(seqIndex==sequence.size()) break; //to stop iterate the main array when all subsequences are found
			if(sequence.get(seqIndex).equals(array.get(i))) seqIndex++;
		}
    return seqIndex==sequence.size();
  }
}
