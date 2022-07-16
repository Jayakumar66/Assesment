package prodapt;

public class SimpleInterest {
	

	static int principle;
	static int rate;
	static int time;
	static int simpleInterest;
	static int totalAmount;

	static void simple_Interest() {
		simpleInterest = (principle * rate * time) / 100;
		System.out.println("Simple Interest is  " + simpleInterest);
		totalAmount = simpleInterest + principle;
		System.out.println("Total Amount Is " + totalAmount);

}
}
