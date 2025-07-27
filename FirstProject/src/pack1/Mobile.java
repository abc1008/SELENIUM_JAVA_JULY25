package pack1;

public class Mobile 
{
//	Properties/Attributes: 
	
	int height;
	int width;
	String screenType;
	String color;
	String companyName;
	String model;
	
	public Mobile(int height,int width,String screenType, String companyName,String color)
	{
		this.height = height;
		this.width = width;
		this.companyName = companyName;  // initializing non-static variable
		this.screenType =  screenType;
		this.color =  color;
		
		
	}
	
	
//	Behavior/Actions: Calling, c, c, Photography
	
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
	
	public void playGames()
	{
		
	}
	
	
	
	public static void main(String[] args) {
		
		Mobile mobile1 = new Mobile(10,6, "Touch Screen", "Apple", "Black");
		System.out.println(mobile1.companyName); 
		
		mobile1.callToSomeone();
		
		
		Mobile mobile2 = new Mobile(11,5, "Touch Screen", "One-Plus", "White");
		
		
		
		
		
	}
	
	
}
