package FactoryPattern;

public abstract class Me {
public abstract Pets myPet();
public  void introduct(){
	Pets getMyPet = myPet();
	System.out.println("----------");
	getMyPet.talk();
	System.out.println("----------");
	Pets child = getMyPet.giveBirth();
	System.out.println("----------");
	child.talk();
	
}

}
