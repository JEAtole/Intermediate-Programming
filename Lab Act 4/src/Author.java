public class Author {
	
	private String authorName;
	private String email;
	private String gender;
	
	public Author(String authorName, String email, String gender) {
		setAuthorName(authorName);
		setEmail(email);
		setGender(gender);

	}

	public void print() {
		System.out.println("AUTHOR: " + getAuthorName());
		System.out.println("GENDER: " + getGender());
		System.out.println("EMAIL: " + getEmail());
		System.out.println();
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email) {

		String specialChar1 = "(.*[@].*$)";
		String specialChar2 = "(.*[.].*$)";

		if ((!email.matches(specialChar1))||(!email.matches(specialChar2))) {
			this.email = "";
			System.out.println("Invalid email! Set to empty string.");
		} else {
			this.email = email;
		}

	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender) {

		if ((gender.equalsIgnoreCase("female"))||(gender.equalsIgnoreCase("male"))) {
			this.gender = gender;
		} else {
			this.gender = "Unknown";
			System.out.println("Invalid gender! Set to unknown.");
		}

	}

}
