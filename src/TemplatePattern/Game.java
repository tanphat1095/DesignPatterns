package TemplatePattern;

public abstract class Game {
	protected abstract void initialize();
	protected   abstract void startPlay();
	protected   abstract void endPlay();
	public final void play(){
		initialize();
		startPlay();
		endPlay();
		
		
	}
}
