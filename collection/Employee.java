package collection;

public class Employee {
	
	public Employee() {
		
	}
	public Employee(String name, String company) {
		setCompany(company);
		setName(name);
	}
	private String name;
	private String company;
	
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String toString() {
		return (getName() + "  "+ getCompany());
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) return true;
		
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Employee emp = (Employee) obj;
		if(!name.equalsIgnoreCase(emp.getName())) return false;
		return company.equals(emp.getCompany());
		
		//return super.equals(obj);
	}
	
	
	
}
