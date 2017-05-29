package VisitorPattern;

public class Mouse implements ComputerPart{

	public Mouse() {
		// TODO Auto-generated constructor stub
	}

	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
		
	}

}
