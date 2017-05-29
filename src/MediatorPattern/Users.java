package MediatorPattern;

public class Users {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Users(String name) {
	
	this.name = name;
}

public void sendMessages(String messages){
	chatRoom.send(this, messages);
	
}
}
