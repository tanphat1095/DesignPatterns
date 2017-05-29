package VisitorPattern;

public class Display implements ComputerPartVisitor {



	public void visit(Computer computer) {
		System.out.println("Computer Displayed");
		
	}

	public void visit(Mouse mouse) {
		System.out.println("Mouse Displayed");
		
	}

	public void visit(Keyboard keyboard) {
		System.out.println("Keyboard Displayed");
		
	}

	public void visit(Monitor monitor) {
		System.out.println("Monitor Displayed");
		
	}

}
