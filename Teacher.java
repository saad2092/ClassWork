package ISa;

public class Teacher extends Person{
	String designation;
	
	Teacher(String n, int ID, String dep, String des){
		name=n;
		id=ID;
		department=dep;
		designation=des;
	}
	void disinfo1() {
		System.out.println("Designation: "+ designation);
	}
	

}
