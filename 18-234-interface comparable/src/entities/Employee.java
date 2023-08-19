package entities;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) { //comparar um objeto com outro 
//		return name.compareTo(o.getName()); //por em ordem alfabetica
		return - salary.compareTo(o.getSalary()); //por em ordem de salario , o menos na frente é pra deixar em ordem decrescente
	}
}
