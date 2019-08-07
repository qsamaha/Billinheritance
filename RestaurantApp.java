		

public class RestaurantApp {
	public static void main(String[] args) {
		Bill b = new Bill(15.80, 0.06);
		pay(b);
		
		TippableBill c = new TippableBill(8.50, 0.06, 2.00);
		pay(c);
		

	}
	
	public static Bill pay (Bill A) {
		System.out.println("$" + A.calcTotal());
		return null;
		
		
	}
	

}
