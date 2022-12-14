package basics.java.testif;

public class EmployeeDetails implements Comparable<EmployeeDetails> {
	private String empName;
	private int empId;
	private String mobile;
	private double salary;
	
	
	

	public EmployeeDetails() {}
	
	

	public EmployeeDetails(String empName, int empId , double salary, String mobile ) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		this.mobile= mobile;
		
		
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	// toString turns object into string and return object into string 
	public String toString() {
		
		return empName +" ,"+ empId +" ,"+ salary + ", " +mobile;
	}



	@Override
	public int compareTo(EmployeeDetails o) {
		// TODO Auto-generated method stub
		//return this.getEmpName().compareTo(o.getEmpName());
		//return this.getEmpId()-o.getEmpId();
		return (int) (o.getSalary()-this.getSalary());
		
	}


}
