
public class TippableBill extends Bill{
	private double tip;

	public TippableBill(double tip) {
		super();
		this.tip = tip;
	}

	


	public TippableBill() {
		super();
		// TODO Auto-generated constructor stub
	}




	public TippableBill(double subTotal, double total, double tip) {
		super(subTotal, total);
		this.tip = tip;
		// TODO Auto-generated constructor stub
	}




	@Override
	public double calcTotal() {
		
		return super.calcTotal() + tip;
	}
	
	
	
	
	

}
