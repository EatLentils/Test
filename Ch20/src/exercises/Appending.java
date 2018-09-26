package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Appending {
	public static <E> void append(List<E> list1, List<E> list2){
		E[] arr = (E[])list2.toArray();
		int len = arr.length;
		for(int i = 0; i < len; i++){
			list1.add(list2.get(i));
		}
	}
	public static <E> void append4a(List<E> list1, List<E> list2){
		ListIterator it = list2.listIterator();
		while(it.hasNext()){
			list1.add((E)it.next());
		}
	}
	
	public static <E> void append4b(List<E> list1, List<E> list2){
		for(E x : list2){
			list1.add(x);
		}
	}
	
	public static void main(String[] args){
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(-1);
		l1.add(0);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		append4b(l1, l2);
		for(int x : l1){
			System.out.println(x);
		}
	}
}
