package NullObject;

public class NullCustomer extends AbtractsCustomer {
	
	@Override
	public boolean isNul() {
		
		return true;
	}
	@Override
	public String getName() {
		return "Object is null";
	}

	

}
