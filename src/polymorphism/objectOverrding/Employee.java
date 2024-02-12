package polymorphism.objectOverrding;

public class Employee extends Object{
	
	String empName;
	String deptName;
	String empManager;
	int empId;
	
	void setData(String eName,String deptName,String empManager,int empId) {
		/*
		 * empName = eName; deptName = deptName; empManager = empManager; empId = empId;
		 */
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setEmpManager(String empManager) {
		this.empManager = empManager;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String toString() {
		return "emp name is - "+empName+" dept name is  - "+deptName+" manager name is "+empManager+" emp id is - " +empId;
	}

}
