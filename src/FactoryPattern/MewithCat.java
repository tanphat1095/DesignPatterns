package FactoryPattern;

public class MewithCat extends Me {

	@Override
	public Pets myPet() {
		// TODO Auto-generated method stub
		return new Cat();
	}

	

	

}
