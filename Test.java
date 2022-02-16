package ISa;

public class Test {
	public static void main(String[] arg) {
		System.out.println("Teachers Info: \n");
		Teacher t1= new Teacher("Roy", 9090921, "SWE", "Senior");
		t1.disinfo();
		t1.disinfo1();
		
		System.out.println("\n");
		Teacher t2= new Teacher("Shubash", 9090932, "SWE", "Junior");
		t2.disinfo();
		t2.disinfo1();
		System.out.println("\n");
		
		System.out.println("Students Info: \n");
		Students s1= new Students("SAAD", 20135554, "SWE", "31");
		s1.disinfo();
		s1.disinfo2();
		
		System.out.println("\n");
		Students s2= new Students("Azman", 20135550, "SWE", "31");
		s2.disinfo();
		s2.disinfo2();
	}

}
