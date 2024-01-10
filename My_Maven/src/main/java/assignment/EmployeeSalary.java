package assignment;

public class EmployeeSalary {
	String emp_name;
	int basic;
	int bonus;
	int lop;
	
	public int salary(String name,int basic_pay,int bonus_amt,int lop_amt) {
		emp_name =name;
		basic = basic_pay;
		bonus=bonus_amt;
		lop=lop_amt;
		System.out.println("Employee Name Salary Slip ");
		System.out.println();
		System.out.println("Employee Name 	: "+emp_name);
		System.out.println("Basic Pay	: "+basic);
		System.out.println("Bonus Amount	: "+bonus);
		System.out.println("Deduction Amount: "+lop);
		return basic;
	}
	
	public int deductions(int basic) {
		int hra = (5*basic)/100;
		int pf =(20*basic)/100;
		int tot_ded =hra+pf;
		System.out.println("HRA Amount	: "+hra);
		System.out.println("PF Amount	: "+pf);
		return tot_ded;
		
	}
	public void netsalary(int ded) {
		int total_salary = basic+bonus-lop-ded;
		System.out.println("Net Amount	: "+total_salary);
	}

	public static void main(String[] args) {
		EmployeeSalary gross_sal = new EmployeeSalary();
		int basic_amt =gross_sal.salary("Anu",25000,1500,1000);
		EmployeeSalary ded_sal = new EmployeeSalary();
		int ded_amt = ded_sal.deductions(basic_amt);
		EmployeeSalary net_sal = new EmployeeSalary();
		net_sal.netsalary(ded_amt);

	}

}
