package Assignment;

public class Employee {
private String name;
private int year,salary;
private String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public static void main(String[] args) {
	Employee emp1=new Employee();
	Employee emp2=new Employee();
	Employee emp3=new Employee();
	emp1.setName("Robert");
	emp1.setYear(1994);
	emp1.setAddress("64C- WallsStreet");
	emp1.setSalary(20000);
	emp2.setName("Sam");
	emp2.setYear(2000);
	emp2.setAddress("68D- WallsStreet");
	emp2.setSalary(50000);
	emp3.setName("John");
	emp3.setYear(1999);
	emp3.setAddress("26B- WallsStreet");
	emp3.setSalary(55000);
	System.out.print(emp1.getName()+"\t");
	System.out.print(emp1.getYear()+"\t");
	System.out.print(emp1.getAddress()+"\t");
	System.out.println(emp1.getSalary()+"\t");
	System.out.print(emp2.getName()+"\t");
	System.out.print(emp2.getYear()+"\t");
	System.out.print(emp2.getAddress()+"\t");
	System.out.println(emp2.getSalary()+"\t");
	System.out.print(emp3.getName()+"\t");
	System.out.print(emp3.getYear()+"\t");
	System.out.print(emp3.getAddress()+"\t");
	System.out.print(emp3.getSalary()+"\t");
	
	
	
	
	
	
	
}
}
