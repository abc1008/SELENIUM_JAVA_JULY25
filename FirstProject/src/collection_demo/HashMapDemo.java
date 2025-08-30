package collection_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		
//		key-value pairs
//		It does not allow duplicate keys
		
//		emp_id, empName
//		city, population
		
		
//		HashMap<KeyDataType, ValueDataType> mapName = new HashMap<>();
		
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(101, "ABC");
		map1.put(102, "PQR");
		map1.put(103, "TUV");
		map1.put(104, "ABC");
		map1.put(105, "TYR");
		map1.put(103, "ABC");
		map1.put(104, "GHJ");
		
		System.out.println(map1);
		
		String empName = map1.get(102);
		
		System.out.println(empName);
		
		
		map1.remove(103);
		System.out.println(map1);
		
		
		Set<Integer> keys = map1.keySet();
		
		System.out.println(keys);
		
		
		
		
		System.out.println("containsKey : " + map1.containsKey(1022));
		System.out.println("containsValue : " + map1.containsValue("QWeE"));
		
		
		for(Integer key : keys)
		{
			System.out.println(map1.get(key));
		}
		
		
		Map<Double, Character> map2 = new HashMap<>();
		
		
		
		
		
	}

}
