package VisitorPattern;

public class Monitor implements ComputerPart {

	public Monitor() {
		// TODO Auto-generated constructor stub
	}

	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
		
	}

}
