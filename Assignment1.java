package week1.day1;

public class Assignment1 {
	//To print the data of two wheeler
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chasisNumber = 52349476456454942L;
	boolean isPunctured = false;
	String bikeName = "Bajaj Pulsar 180";
	double runningKM = 43567.9;

	public static void main(String[] args) {
		
		
		Assignment1 obj = new Assignment1();
		System.out.println("******TWO WHEELER DETAILS******");
		System.out.println("No of Wheels: "+obj.noOfWheels+"\nNo of Mirrors: "+obj.noOfMirrors+"\nChasis Number: "+obj.chasisNumber+"\nIs Punctured: "+obj.isPunctured+"\nBike Name: "+obj.bikeName+"\nRunning KM: "+obj.runningKM);

	}

}
