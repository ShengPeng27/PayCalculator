
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double payRate= 100;
		double hour =8.5;
		PayCalculator regularPay = new RegularPay(payRate);		
		System.out.println("The regular pay is $ "+regularPay.computePay(hour));
		//compute pay with regular pay in 8 hours and half
		
		PayCalculator hazardPay = new HazardPay(payRate);
		System.out.println("The hazard pay is $ "+hazardPay.computePay(hour));
		//compute pay with hazard pay in 8 hours and half
	}

}
