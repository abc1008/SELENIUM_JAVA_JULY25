package inheritanceDiscussion;

public class MobileInheritanceConstructor 
{
//	Properties/Attributes: 
	
	int height;
	String companyName;
	
	
//	public MobileInheritanceConstructor()
//	{
//			System.out.println("Parent Constructor Running");
//		
//	}
	
	
	public MobileInheritanceConstructor(int height, String companyName)
	{
		this.height = height;
		this.companyName = companyName;  // initializing non-static variable
		System.out.println("Parent 2 arg Constructor Running");
	}
	
	
	public MobileInheritanceConstructor(int height)
	{
		System.out.println("Parent int Constructor Running");
	}
	
	
	public MobileInheritanceConstructor(String companyName)
	{
		this.companyName = companyName;  // initializing non-static variable
		
		System.out.println("Parent String Constructor Running");
	}
	
	

	
	
}
