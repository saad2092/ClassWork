package ISa;

public class Students extends Person{
	String batch;
	
	Students(String n, int ID, String dep, String bat){
		name=n;
		id=ID;
		department=dep;
		batch=bat;
	}
	void disinfo2() {
		System.out.println("Batch: "+ batch);
	}
	


}
