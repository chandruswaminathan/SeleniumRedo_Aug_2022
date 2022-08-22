package week3.day2;

import java.util.TreeSet;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> set = new TreeSet<Integer>();
		for (Integer integer : data) {
			if(set.add(integer))
			{
				continue;
			}
			else
			{
				System.out.println("Duplicate: "+integer);
			
			}
			

	}
		forLoop(data);

}
	public static void forLoop(int[] data)
	{
		for(int i = 0; i < data.length;i++)
		{
			for(int j=i+1; j< data.length;j++)
			{
				if(data[i]==data[j])
				{
					System.out.println("For Loop Duplicate: "+data[i]);
				}
			}
		}
	}
}
