package FactoryPattern;

public class MeWithDog extends Me{

	@Override
	public Pets myPet() {
		// TODO Auto-generated method stub
		return new Dog();
	}

	

}
