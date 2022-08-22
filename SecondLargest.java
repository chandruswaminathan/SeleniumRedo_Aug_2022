package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,9,2,3,3,6,9};
		Set<Integer> set = new TreeSet<Integer>();
		for (Integer integer : data) {
			set.add(integer);
			
		}
		System.out.println(set);
		List<Integer> list = new ArrayList<Integer>(set);
		int size = list.size();
		System.out.println("Size: "+size);
		System.out.println("Second Largest element is: "+list.get(size-2));
		
		
	}

}
