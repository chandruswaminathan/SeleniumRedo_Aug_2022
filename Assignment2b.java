package week1.day1;

public class Assignment2b {
	//To convert Negative number to Positive number
	public static void main(String[] args) {
		
		int num = -40;
		
		if(num<0)
		{
			int newNum = -(num);
			System.out.println("The Negative number "+num+" has been converted to Positive number: "+newNum);
		}
		else if(num>0)
		{
			System.out.println("The entered number is already a Positive number: "+num);
		}
		else
		{
			System.out.println("The entered number is neither Positive nor Negative: "+num);
		}

	}

}
