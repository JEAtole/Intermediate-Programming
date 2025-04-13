package student_package;

public class Studentinfo
{
	public void Student_info(String name, int age, String gender, String address, int number, String father, String mother)
	{
		display_student(name, age, gender, address,number, father, mother);
	}
	
	public void display_student(String name, int age, String gender, String address, int number, String father, String mother)
	{
		System.out.println("STUDENT DETAILS");
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
		System.out.println("Student Gender: " + gender);
		System.out.println("Student Address: " + address);
		System.out.println("Contact Number: " + number);
		System.out.println("Father's Name: " + father);
		System.out.println("Mother's Name: " + mother);
		System.out.println();
	}
}
