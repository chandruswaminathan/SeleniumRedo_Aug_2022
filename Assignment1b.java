package week1.day2;

public class Assignment1b {

	public static void main(String[] args) {
		
		Assignment1a obj = new Assignment1a();
		int add1 = 10;
		int add2 = 10;
		int result1 = obj.addNumbers(add1, add2) ;
		System.out.println("Addition of "+ add1 +" and "+ add2 + " is: "+ result1);
		
		int sub1 = 1;
		int sub2 = 5;
		int result2 = obj.subNumbers(sub1, sub2);
		System.out.println("Differnce between "+ sub1 +" and "+ sub2 + " is: "+ result2);
		
		double mul1 = 10;
		double mul2 = 2;
		double result3 = obj.mulNumbers(mul1, mul2);
		System.out.println("Multiplication of "+ mul1 +" and "+ mul2 + " is: "+result3);
		
		float div1 = 10f;
		float div2 = 2f;
		float result4 = obj.divNumbers(div1, div2);
		System.out.println("Division of "+ div1 + " and "+ div2 + " is " + result4);

	}

}
