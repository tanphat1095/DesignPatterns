package NullObject;

public class CustomerFactory {
public static final String [] names = {"A","B","C"};

public static AbtractsCustomer getCustomer(String name){
	 for (int i = 0; i < names.length; i++) {
         if (names[i].equalsIgnoreCase(name)){
            return new RealCustomer(name);
         }
      }
      return new NullCustomer();
}
	
}
