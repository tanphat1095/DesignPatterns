package FactoryPattern;

public class Cat extends Pets {

	@Override
	public Pets giveBirth() {
	return new Cat();
	}

	@Override
	public void talk() {
	System.out.println("Meo meo");
		
	}

	

}
