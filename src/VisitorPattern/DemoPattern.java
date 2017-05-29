package VisitorPattern;

public class DemoPattern {

	public static void main(String [] agrs){
		ComputerPart computer = new Computer();
	      computer.accept(new Display());
		
	}

}
