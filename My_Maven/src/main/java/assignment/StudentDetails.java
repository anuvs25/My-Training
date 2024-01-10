package assignment;

class Student {
	String name;
	int number;
	public Student(String name,int number){
		this.name=name;
		this.number=number;
		
	} 
}
class StudentAddress{
	String address;
	public StudentAddress(String addrs){
		address=addrs;
	}
}

public class StudentDetails{
	public static void main(String args[]){
		Student ob = new Student("Anu",11);
		StudentAddress ob1 = new StudentAddress("Trivandrum, Kerala");
		System.out.println("Student Details");
		System.out.println();
		System.out.println("Student Name	: "+ob.name);
		System.out.println("Student RollNo	: "+ob.number);
		System.out.println("Student Address	: "+ob1.address);
	}
}