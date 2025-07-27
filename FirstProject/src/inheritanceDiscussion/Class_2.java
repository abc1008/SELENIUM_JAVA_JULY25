package inheritanceDiscussion;

public class Class_2 extends MobileInheritance{
	
	static String s1 = "Test_2";
	String companyName = "Redmi";
	
	public void m2()
	{
		
		MobileInheritance mb = new  MobileInheritance();
		System.out.println(mb.companyName);
		
		
		System.out.println(super.companyName); // parent class non-static variable
	
		super.browseOverInternet();
	
	}
	
	
	
	public static void main(String[] args) {
		
		playGames();

		System.out.println(s1);
		
		Class_2 c2 = new Class_2();
		System.out.println(c2.companyName);
		
	
		
		
//		super
		
		c2.m2();
		
		MobileInheritance mb = new  MobileInheritance();
		System.out.println(mb.companyName);
		
		mb.browseOverInternet();
		
		
		
	}

}
