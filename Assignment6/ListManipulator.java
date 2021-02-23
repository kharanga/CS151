package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ListManipulator {
	ArrayList<Integer>sort(ArrayList<Integer>myLst, Boolean ascending){
		if(ascending==true) {
			Collections.sort(myLst);
		}
		else {
			Collections.sort(myLst, Collections.reverseOrder());
		}
		return myLst;
	}
	ArrayList<Integer> swapLargestSmallest(ArrayList<Integer>myLst){
		int minIndex = myLst.indexOf(Collections.min(myLst));
		int maxIndex = myLst.indexOf(Collections.max(myLst));
		Collections.swap(myLst, minIndex, maxIndex);
		return myLst;
	}
	void table(ArrayList<Integer>myLst) {
		Collections.sort(myLst);
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(myLst);
		ArrayList<Integer> listWoDup = new ArrayList<>(hashSet);
		int recurrence;
		for(Integer i : listWoDup) {
			recurrence = myLst.lastIndexOf(i)-myLst.indexOf(i)+1;
			System.out.println("Number " + i + " shows up " + recurrence +" time(s)");
		}
	}
}

