package inheritanceDiscussion;

import access_modifiers.ConstructorModifier;
import access_modifiers.TestClass_1;

public class ProtectedTest extends TestClass_1{

	
	
	
	public static void main(String[] args) {
		
		ProtectedTest pt = new ProtectedTest();
		
		System.out.println(TestClass_1.num3);
		
		System.out.println(pt.num4); // child class ref
		
		
		TestClass_1 t1 = new TestClass_1();
//		System.out.println(t1.num4);
		
		pt.m3(); // child class ref
		
//		ConstructorModifier cm = new ConstructorModifier();
		
		
	}
	
	
	
}
