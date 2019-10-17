package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("Sachin", "xyz");
		Employee emp2 = new Employee("Sachin", "xyz");
		
		Map<Employee, String> hashMap = new HashMap<>();
		
		hashMap.put(emp1, "first employee");
		hashMap.put(emp2, "second employee");
		
		System.out.println(hashMap);

	}

}
