package FactoryPattern;

public class mains {

	public static void main(String [] agrs){
		Me me = new MewithCat();
		me.introduct();
		me = new MeWithDog();
		me.introduct();
		
	}

}
