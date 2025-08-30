package collection_demo;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo {
	
	
	public static void main(String[] args) {
		
//		Set<E>
		
		
//		It does not allow duplicate elements
//		It does not follow insertion order
		
//		HashSet<DataType> setName = new HashSet<DataType>();
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		set1.add(10);
		set1.add(20);
		set1.add(23);
		set1.add(40);
		set1.add(50);
		set1.add(23);
		set1.add(40);
		set1.add(70);
		
		System.out.println(set1);
		
		
//		remove
		
		boolean result = set1.remove(203);
		
		System.out.println("is Removed : "+result);
		System.out.println(set1);
		
		
		System.out.println(set1.size());
		
		boolean result2  = set1.contains(400);
		
		System.out.println(result2);
		
		System.out.println();
		System.out.println("******* Set Iteration ********");
		System.out.println();
		
		for(Integer num : set1)
		{
			System.out.println(num * 2);
		}
		
		
		System.out.println(set1.contains(40));
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(set1);
		
		System.out.println(list2);
		
		
		System.out.println(list2.get(5));
		
		
	}

}
