package collection;

import java.util.HashSet;
import java.util.Iterator;

class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
}

public class Hashset_example {

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		Student s1 = new Student(101, "anup", 14);
		Student s2 = new Student(102, "swara", 12);
		Student s3 = new Student(103, "kirti", 16);
		//Student s4 = new Student(101, "anup", 14);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		//set.add(s1);
		//set.add(s4);
		for(Student st: set) {
			System.out.println(st.id+" "+st.name+" "+st.age);
		}
		
	}

}
