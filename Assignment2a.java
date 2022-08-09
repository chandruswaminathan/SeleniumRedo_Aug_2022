package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Assignment2a {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,6,7,5,8};
		int length = arr.length;
		// Sort the array
		Arrays.sort(arr);
		// loop through the array (start i from arr[0] till the length of the array)
		for(int i = 0; i < length;)
		{
			// check if the iterator variable is not equal to the array values respectively
			if(arr[i]!=i+1)
				{
				// print the number
				System.out.println("Missing element is: "+(i+1));
				// once printed break the iteration
				break;
				}
			else
				{
				i++;
				}
		}

	}

}
