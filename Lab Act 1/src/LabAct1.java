import java.util.Objects;
import java.util.Scanner;

public class LabAct1 {

	// Simulation - Lab Act 1 - Methods and Recursions
	
	public static void main(String[] args) {
		Recursion();
	}
	
	public static void Recursion() {

		Scanner u_input = new Scanner(System.in);
		System.out.print("Please input password: ");
		String password = u_input.nextLine();
		String password_validation = validate(password);
		System.out.println("The password (" + password + ") is " + password_validation + ".");

		if (Objects.equals(password_validation, "valid")) {
		    System.out.println("Password Accepted.");
		}

		if (Objects.equals(password_validation, "not valid")) {
            System.out.println("You may try again.");
            System.out.println();
            Recursion ();
		}

	}
	
	public static String validate(String check_password) {

		String result = "valid";

		//Password length should be between 8 and 20.
		if (check_password.length() < 8 || check_password.length() > 20) {
            System.out.println("Password must be more than 8 and less than 20 characters in length.");
            result = "not valid";
        }

        //Must have at least one uppercase character.
		String upperCaseChars = "(.*[A-Z].*)";
        if (!check_password.matches(upperCaseChars)) {
            System.out.println("Password must have atleast one uppercase character.");
            result = "not valid";
        }

        //Must have at least one lowercase character.
        String lowerCaseChars = "(.*[a-z].*)";
        if (!check_password.matches(lowerCaseChars)) {
            System.out.println("Password must have atleast one lowercase character.");
            result = "not valid";
        }

        //Must have at least one numeric character.
        String numbers = "(.*[0-9].*)";
        if (!check_password.matches(numbers)) {
            System.out.println("Password must have atleast one number.");
            result = "not valid";
        }

        //Must have at least one special symbol among @#$%
        String specialChars = "(.*[@#$%].*$)";
        if (!check_password.matches(specialChars )) {
            System.out.println("Password must have atleast one special character among @#$%");
            result = "not valid";
        }

        //Should NOT start with a number.
        char[] charArray = check_password.toCharArray();
        boolean bool = Character.isDigit(charArray[0]);
        if (bool) {
            System.out.println("Password must not start with a number.");
            result = "not valid";
        }

        return result;
	}

}






