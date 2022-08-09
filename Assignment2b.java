package week1.day2;

import java.util.Arrays;

public class Assignment2b {

	public static void main(String[] args) {
		//Declare An array for {3,2,11,4,6,7};
		int[] a = {3,2,11,4,6,7};
		Arrays.sort(a);
		int arr1 = a.length;
		//Declare another array for {1,2,8,4,9,7};
		int[] b = {1,2,8,4,9,7};
		Arrays.sort(b);
		int arr2 = b.length;
		//Declare for loop iterator from 0 to array length
		for(int i = 0; i < arr1; i++)
		{
			//Declare a nested for another array from 0 to array length
			for(int j = 0; j < arr2; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
