import java.util.*;

class Program {

  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    // O(nlogn) time because list is sorted
		// O(1) space bacause it is the same list so no new lists created
		Collections.sort(redShirtHeights);
		Collections.sort(blueShirtHeights);
		boolean redIsTaller=true;

		if(redShirtHeights.size()!= blueShirtHeights.size()) return false;
		if( redShirtHeights.get(0) < blueShirtHeights.get(0) && redIsTaller==true) 	
				redIsTaller=false;
		for(int i=0;i<redShirtHeights.size(); i++){
			if(redShirtHeights.get(i) == blueShirtHeights.get(i)) return false;		
			if(redIsTaller) {
				if(redShirtHeights.get(i) < blueShirtHeights.get(i)) return false;
			}else
				if(redShirtHeights.get(i) > blueShirtHeights.get(i)) return false;
		
		}
		return true;
	}
}
