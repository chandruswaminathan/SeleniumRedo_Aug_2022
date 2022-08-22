package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] data = {3,2,10,4,6,10,2,3,3,6,10,1,5,7,8};
		Set<Integer> set = new TreeSet<Integer>();
		for (Integer integer : data) {
			set.add(integer);			
		}
		System.out.println(set);
		for(int i = 0; i< set.size();i++)
		{
		if(set.contains(i+1))
				{
			continue;
				}
		else
		{
			System.out.println("The missing number is: "+(i+1));
		}

	}

}
}
