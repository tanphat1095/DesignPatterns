package TemplatePattern;

public class TemplatePattern {

	public static void main(String [] agrs){
		Game  game = new Football();
		game.play();
		game = new Cricket();
		game.play();
		
	}

}
