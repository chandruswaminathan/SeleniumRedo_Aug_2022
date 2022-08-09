package week1.day2;

public class Assignment4 {

	public static void main(String[] args) {
		
		int num = 53;
		int count = 0;
		//Iterate through all numbers from 2 to n-1 (input) and for every number check if it divides n (input).
		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				count++;
			}
			
		}
		if (count > 0)
		{
			System.out.println("The entered number "+ num + " is not a prime number");
		}
		else
		{
			System.out.println("The entered number "+ num + " is a prime number");
		}

	}

}
