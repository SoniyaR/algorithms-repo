package src;

public class Test_immutable {

	public static void main(String[] args) {
		Age age= new Age();
		age.setDay(1);
		age.setMonth(3);
		age.setYear(1992);
		
		Immutable_Student student = new Immutable_Student(1, "Alex", age);
		
		System.out.println("students age-> year is "+ student.getAge().getYear());
		
		age.setYear(1994);
		
		System.out.println("students age-> year is "+ student.getAge().getYear());

	}

}
