public class Booktest {

	public static void main(String[] args) {
		
		Author author1 = new Author("Gojo Satoru", "G.Satoru@gmail.com", "Male");
		author1.print();
		
		Book book1 = new Book("Grimoire Book", author1, 1499, 10);
		book1.print();
		
		author1.setEmail("hotdog@gmail.com");
		author1.print();
		
		book1.getAuthor().setEmail("Cheesedog@gmail.com");
		book1.print();
		
	}

}
