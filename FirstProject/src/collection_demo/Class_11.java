package collection_demo;

import java.util.ArrayList;
import java.util.List;

public class Class_11
{
	public static void main(String[] args)
	{
		
		
		int [] nums  = new int[5];
		nums[0] = 100;
		nums[0] = 200;
		nums[0] = 300;
		
		
		int [] nums2 = {10,20,30};
		
		System.out.println(nums);
		
		
		
//		Search/Get/fetch 
//		Insert 
//		Delete/Remove
		
		
//		ArrayList<DataType> listName = new ArrayList<DataType>();
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		System.out.println(list1);
		
		
//		get
		
		Integer num = list1.get(3);
		System.out.println(num);
		
		
//		remove
		
		 Integer removedEle = list1.remove(3);
		
		System.out.println("removedEle : " + removedEle);
		
		
		System.out.println(list1);
		
		
//		set
		
		list1.set(2, 500);
		System.out.println(list1);
		
		System.out.println(list1.size());
		
		
		list1.add(2, 150);
		
		System.out.println(list1);
		
		
		for(Integer num2 : list1)
		{
			System.out.println(num2 * 2);
		}
		
	}
	
	
	
	

}
