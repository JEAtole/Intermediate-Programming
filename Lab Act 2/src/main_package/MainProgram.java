package main_package;
import employee_package.Employeeinfo;
import student_package.*;

public class MainProgram {
	public static void main(String[] args) {

		Studentinfo stud_info = new Studentinfo ();
		Employeeinfo emp_info = new Employeeinfo ();
		Acadinfo acad_info = new Acadinfo();
		
		//Student #1			
		stud_info.Student_info("Sukuna Ryomen", 25, "M","Japan", 9320756, "Mr. Gojou Satoru", "Mrs. Yuuji Itadori");				
		emp_info.display_Employee("Glenn Radars", "Faculty", "Professor");
		acad_info.Acad_info(136201, 90, 90, 100, 95, "100%");
		
		System.out.println("NEXT STUDENT");
		System.out.println();
		
		//Student #2
		stud_info.Student_info("Anya Forger", 28, "F","Japan", 9320800, "Mr. Loid Forger", "Mrs. Yor Forger");
		emp_info.display_Employee("Koro Sensei", "Faculty", "Professor");
		acad_info.Acad_info(136539, 80, 80, 85, 90, "98%");

	}

}
