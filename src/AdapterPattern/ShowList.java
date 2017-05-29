package AdapterPattern;

import java.util.ArrayList;
import java.util.List;

public class ShowList implements IShowListName {
private ShowName shows;
	public void showList(List<String> name) {
		for(String names : name){
			shows.ShowName_(names);
			
		}
		
	}
public ShowList(ShowName showname){
	this.shows = showname;
	
}
	public static void main(String [] agrs){
		List<String> list = new ArrayList<String>();
		list.add("John   ");
		list.add("   Cena ");
		list.add("   Mr.Bean                ");
		
		// Adapter chuyen showname sang showlistname;
		IShowListName adapter= new ShowList(new ShowName());
		adapter.showList(list);
		
		
	}

}
