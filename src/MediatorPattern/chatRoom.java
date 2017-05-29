package MediatorPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class chatRoom {

	public static void send(Users users, String messages){
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM HH:mm");
		System.out.println(sf.format(new Date())+"["+users.getName()+"] : "+messages);
		
	}

}
