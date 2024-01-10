package inheritanceassignment;

public class EmployeeDeduction extends EmployeeSalary{

	public void deductions() {
		int hra = (5*basic)/100;
		int pf =(20*basic)/100;
		int tot_sal = basic+bonus+hra-lop-pf;
		System.out.println("HRA Amount	: "+hra);
		System.out.println("PF Amount	: "+pf);
		System.out.println("Net Salary	: "+tot_sal);
	}
}
