package inheritanceDiscussion;

public class Class_A extends MobileInheritanceConstructor{
	
	
	public Class_A()
	{
		super(8, "Sting"); // multiple agr constructor 
		System.out.println("Child Construtcor Running");
	}
	
	
	public static void main(String[] args) {
		
		Class_A a1 = new Class_A();
//		a1.companyName;
		
	}

}
