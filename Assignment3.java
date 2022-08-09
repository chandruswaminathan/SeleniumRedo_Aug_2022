package week1.day2;

public class Assignment3 {

	public static void main(String[] args) {
		
		//Print Fibbinocci series for first 11 numbers
		//Write a logic to print fibbinocci from 0 to 56
		
		//Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		//Print first number
		System.out.println(firstNum);
		System.out.println(secNum);
		//Iterate from 1 to the 11
		for(int i = 1; i <= 11; i++)
		{
			//Add first and second number assign to sum
			sum = firstNum + secNum;
			//Assign second number to the first number
			firstNum = secNum;
			//Assign sum to the second number
			secNum = sum;
			//Print sum
			System.out.println(sum);
		}
		
			
			
		}

	}


