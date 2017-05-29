package NullObject;

public class NullObjectDemo {

	
public static void main(String[]agrs){
	
			AbtractsCustomer customer1 = CustomerFactory.getCustomer("A");
			AbtractsCustomer customer2 = CustomerFactory.getCustomer("Bob");
			AbtractsCustomer customer3 = CustomerFactory.getCustomer("B");
			AbtractsCustomer customer4 = CustomerFactory.getCustomer("Laura");

	      System.out.println("Customers");
	      System.out.println(customer1.getName());
	      System.out.println(customer2.getName());
	      System.out.println(customer3.getName());
	      System.out.println(customer4.getName());
}
}
