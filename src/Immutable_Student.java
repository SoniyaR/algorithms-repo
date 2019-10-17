package src;

//passing mutable class to immutable class
//Age is mutable class, which we added as one of the field in this class
//now, test if this class is immutable still by test method.

//this is not immutable class as the age object modification
//in test class changes the Immutable_student object-> age valuess
//i.e. state is modified after its construction
/*
public final class Immutable_Student {
	
	private final int id;
	private final String name;
	private final Age age;
	
	public Immutable_Student(int id, String name, Age age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
		
	}

	public int getId() {
		return id;
	}
	
	public Age getAge()	{
		return age;
	}

}
*/

//Let's make it immutable now
//how?
//make clone of mutable class in constructor and use the same
public final class Immutable_Student {
	
	private final int id;
	private final String name;
	private final Age age;
	
	public Immutable_Student(int id, String name, Age age) {
		this.id = id;
		this.name = name;
		Age cloneAge = new Age();
		cloneAge.setDay(age.getDay());
		cloneAge.setMonth(age.getMonth());
		cloneAge.setYear(age.getYear());
		this.age = cloneAge;
	}
	
	public String getName() {
		return name;
		
	}

	public int getId() {
		return id;
	}
	
	public Age getAge()	{
		return age;
	}

}
