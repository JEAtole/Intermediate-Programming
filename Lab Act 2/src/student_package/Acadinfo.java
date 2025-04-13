package student_package;

public class Acadinfo {

	public void Acad_info(int number, float Q1, float Q2, float midterm, float finals, String attendance) {
		float average = (Q1 + Q2 + midterm + finals) / 4;
		display_EducDetails(number, average, attendance);
	}
	
	public void display_EducDetails(int number, float average, String attendance) {
		System.out.println("STUDENT EDUCATIONAL DETAILS");
		System.out.println("Student Number: " + number);
		System.out.println("Student Grade Average: " + average);
		System.out.println("Student Attendance: " + attendance);
		System.out.println();
	}

}
