package week1.day2;

public class Assignment1a {
	
	public int addNumbers(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	public int subNumbers(int a, int b)
	{
		int c=0;
		if(a>b)
		{
			c = a-b;
		}
		else
		{
			c = b-a;
		}
		return c;
	}
	
	public double mulNumbers(double a, double b)
	{
		double c = a*b;
		return c;
	}
	
	public float divNumbers(float a, float b)
	{
		float c = 0;
		{
			c = a/b;
		}
		return c;
	}

}
