package inheritanceDiscussion;

//			  Child/Sub-Class 	Parent/SuperClass
public class Class_1 extends MobileInheritance
{
	
	
	String name = "Class_1";
	String car = "BMW";
	
	
	public static void m5()
	{
		
	}
	
	
	public static void main(String[] args) {
		
		
//		MobileInheritance mb = new MobileInheritance();
//		System.out.println(mb.companyName);
//		
	
		Class_1 c1 = new Class_1();
		System.out.println(c1.companyName);
		
//		c1.callToSomeone();
		
		
		
		playGames();
		
		System.out.println(MobileInheritance.s1);
		
		
		
	}

}
