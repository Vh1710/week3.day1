package week3.day1;

public class Student extends Department {
	public void studentName() {
		System.out.println("vignesh");
	
	}public void studentDept() {
		System.out.println("csc");
	
	}
public static void main(String[] args) {
	Student obj =new Student();
	obj.collegeName();
	obj.collegeCode();
	obj.collegeRank();
	obj.deptName();
	obj.studentName();
	obj.studentDept();
}
}
