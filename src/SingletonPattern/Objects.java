package SingletonPattern;

public class Objects {

	private Objects() {
	}
	
	private static final Objects intance = new Objects();
	public  synchronized Objects getIntances(){
		if(intance ==null){
		 //intance =new Objects();
			
		}
		return intance;
	}
	
	public static void main(String [] agrs){
		double a = 1.9;
		int b = (int) a;
		System.out.println(b);
		
		
		
	}
}
