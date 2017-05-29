package TemplatePattern;

public class Football extends Game {

	@Override
	protected
	void initialize() {
		System.out.println("Init Football");
		
	}

	@Override
	protected
	void startPlay() {
		System.out.println("Start Football");
		
	}

	@Override
	protected
	void endPlay() {
		System.out.println("End Football");
		
	}


}
