package inheritanceDiscussion;

public class MobileInheritance 
{
//	Properties/Attributes: 
	
	int height;
	int width;
	String screenType;
	String color;
	String companyName;
	String model;
    static String s1 = "Test";
	boolean sliderButton;
	
//	public MobileInheritance(int height,String companyName)
//	{
//		this.height = height;
//		this.companyName = companyName;  // initializing non-static variable
//		sliderButton = false;
//		
//	}
//	
	
//	Behavior/Actions: Calling, c, c, Photography
	
	public void makeSilent()
	{
		if(sliderButton == false)
		{
			System.out.println("Mobile is not silent");
			sliderButton = true;
		}
	}
	
	public void callToSomeone()
	{
		if(this.screenType.equals("Touch Screen"))
		{
			System.out.println("Call From Touch Screen");
		}
		
		
		
		System.out.println("Calling from callToSomeone");
	}
	
	
	public String browseOverInternet()
	{
		return "Copied Text";
	}
	
	public static void playGames()
	{
		System.out.println("playGames");
		
//		this.height = 90;
	}
	
	
	
	public static void main(String[] args) {
		
		MobileInheritance mobile1 = new MobileInheritance();
		System.out.println(mobile1.companyName); 
		
//		mobile1.callToSomeone();
		
		
//		MobileInheritance mobile2 = new MobileInheritance();
		
		
//		playGames();
		
		Class_1 c1 = new Class_1();
		System.out.println(c1.car);
		
		
		
		
	}
	
	
}
