package assignment;

public class StudentGrade {
	String name;
	int eng_marks;
	int maths_marks;
	int bio_marks;
	
	public StudentGrade(String name,int eng_marks, int maths_marks, int bio_marks) {
		this.name= name;
		this.eng_marks = eng_marks;
		this.maths_marks = maths_marks;
		this.bio_marks = bio_marks;
		System.out.println("Marks sheet of "+name);
		System.out.println();
		System.out.println("Marks obtained for English	: "+eng_marks);
		System.out.println("Marks obtained for Maths	: "+maths_marks);
		System.out.println("Marks obtained for Biology	: "+bio_marks);
		
	}

	public int totalMarks() {
		int tot_marks = eng_marks+maths_marks+bio_marks;
		return tot_marks;
	}
	
	public static void gradeCalc(int total) {
		if (total>=280) {
			System.out.println("The student has got A+");
		}else if(260<=total&& total<280) {
			System.out.println("The student has got A");
		}else if(240<=total&& total<260) {
			System.out.println("The student has got B+");
		}else if(220<=total&& total<240) {
			System.out.println("The student has got B");
		}else if(200<=total&& total<220) {
			System.out.println("The student has got C+");
		}else if(180<=total&& total<200) {
			System.out.println("The student has got C");
		}else if(160<=total&& total<180) {
			System.out.println("The student has got D");
		}else if(140<=total&& total<160) {
			System.out.println("The student has got E");
		}else {
			System.out.println("The student is failed");
		}
	}
	
	/*public static void gradeCalc(int total) {
		if (total>=280) {
			System.out.println("The student has got A+");
		}else if(260<=total&& total<280) {
			System.out.println("The student has got A");
		}else if(240<=total&& total<260) {
			System.out.println("The student has got B+");
		}else if(220<=total&& total<240) {
			System.out.println("The student has got B");
		}else if(200<=total&& total<220) {
			System.out.println("The student has got C+");
		}else if(180<=total&& total<200) {
			System.out.println("The student has got C");
		}else if(160<=total&& total<180) {
			System.out.println("The student has got D");
		}else if(140<=total&& total<160) {
			System.out.println("The student has got E");
		}else {
			System.out.println("The student is failed");
		}
	}*/
		
	public static void main(String[] args) {
		StudentGrade ob = new StudentGrade("Ardra",92,99,98);
		int student_one = ob.totalMarks();
		System.out.println("Total marks obtained out of 300	: "+student_one);
		System.out.println();
		StudentGrade.gradeCalc(ob.totalMarks());
		System.out.println();
		
		StudentGrade ob1 = new StudentGrade("Agneya",90,95,72);
		int student_two = ob1.totalMarks();
		System.out.println("Total marks obtained out of 300	: "+student_two);
		System.out.println();
		StudentGrade.gradeCalc(ob1.totalMarks());
		System.out.println();
		
	}

}
