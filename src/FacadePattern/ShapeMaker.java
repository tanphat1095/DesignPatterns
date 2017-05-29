package FacadePattern;

public class ShapeMaker {
private hinhchunhat hcn;
private hinhtamgiac htg;
private hinhtron ht;
public ShapeMaker() {
	hcn = new hinhchunhat();
	htg = new hinhtamgiac();
	ht = new hinhtron();
}

public void drawhinhchunhat(){
	hcn.draw();
}	
public void drawhinhtron (){
	ht.draw();
}
public void drawhinhtamgiac(){
	htg.draw();
}

}
