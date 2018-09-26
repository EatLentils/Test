package exercises;

import java.util.*;

public class Alternating {
	public static LinkedList<String> mix(List<String> list1, List<String> list2){
		LinkedList<String> retList = new LinkedList<String>();
		ListIterator<String> it1 = list1.listIterator();
		ListIterator<String> it2 = list2.listIterator();
		while(it1.hasNext()){
			retList.add(it1.next());
			retList.add(it2.next());
		}
		return retList;
	}
	
	public static void main(String[] args){
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("y");
		list1.add("i");
		list1.add("k");
		list2.add("o");
		list2.add("n");
		list2.add("s");
		System.out.println(mix(list1, list2));
	}
}
