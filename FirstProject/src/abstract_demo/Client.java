package abstract_demo;

public class Client
{

	public static void main(String[] args)
	{
		
		Animal animal1 = new Dog();
		animal1.run();
		
		animal1.eat();
		
		Animal animal2 = new Tiger();
		animal2.run();  // overiding
	}
	
	
}
