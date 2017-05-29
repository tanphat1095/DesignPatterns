package MediatorPattern;

public class Demo {

	public static void main(String []agrs){
		Users john = new Users("John Cena");
		john.sendMessages("Hello!");
		
		Users T = new Users("T");
		T.sendMessages("Hi!");
	}

}
