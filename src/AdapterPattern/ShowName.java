package AdapterPattern;

public class ShowName implements IShowName {




	public String chuan_hoa(String name){
	return name.trim();
}

	public void ShowName_(String name) {
		System.out.println("This name: "+chuan_hoa(name));
		
	}
	
}
