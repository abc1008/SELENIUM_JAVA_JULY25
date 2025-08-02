package access_modifiers;

public class TestClass_2 extends TestClass_1
{

	public static void main(String[] args)
	{

		TestClass_1 t1 = new TestClass_1();
		t1.m1();

		TestClass_1.m2();

		System.out.println(TestClass_1.num);
		System.out.println(TestClass_1.num2);

		ConstructorModifier cm = new ConstructorModifier();

	}

}
