import java.util.*;

class Program {
	Map<String,Integer> winners = new HashMap<>();
  public String tournamentWinner(
		//O(n) time | O(k ) 		
		// n is the number of competitions and k is the number of teams
    ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    // Write your code here.
		String winningTeam="";
		String winner="";
	  winners.put(winner,0);
		for(int i=0; i<competitions.size(); i++) {
			if(results.get(i) == 0) {
				winningTeam=competitions.get(i).get(1);
				computeHashMap(winningTeam);
			}else {
				winningTeam=competitions.get(i).get(0);
				computeHashMap(winningTeam);
			}		
			if(winners.get(winningTeam) > winners.get(winner))
					winner=winningTeam;
		}
    return winner;
  }
	
	public  void computeHashMap(String key) {
		if(!winners.containsKey(key)) {
			winners.put(key,0);   // put the key first if it doesnt exist. Otherwise NullPointerException is thrown
		}
	   winners.put(key, winners.get(key) + 3 ); //update the value when the key exists
		}
	
}
