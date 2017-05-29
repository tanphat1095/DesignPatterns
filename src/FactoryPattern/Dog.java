package FactoryPattern;

public class Dog extends Pets {

	@Override
	public Pets giveBirth() {
	return new Dog();
	}

	@Override
	public void talk() {
	System.out.println("Gau Gau");
		
	}

	

}
