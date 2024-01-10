package inheritanceassignment;

public class EmployeeSalary {
	String emp_name ="Anu";
	int basic = 25000;
	int bonus = 1500;
	int lop = 1000;
	public void salary() {
		System.out.println("Employee Salary Slip ");
		System.out.println();
		System.out.println("Employee Name 	: "+emp_name);
		System.out.println("Basic Pay	: "+basic);
		System.out.println("Bonus Amount	: "+bonus);
		System.out.println("Deduction Amount: "+lop);
	}

}
