package NullObject;

public class RealCustomer extends AbtractsCustomer {

	public  RealCustomer(String name) {
		this.name= name;
		
	}
	@Override
	public boolean isNul() {
		
		return false;
	}
	@Override
	public String getName() {
		return name;
	}



}
