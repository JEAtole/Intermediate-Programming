public class Book {
	private final String bookTitle;
	private final Author author;
	private double price;
	private int stock;
	
	public Book(String bookTitle, Author author, double price, int stock) {
		this.bookTitle = bookTitle;
		this.author = author;
		setPrice(price);
		setStock(stock);
	}

	public void print() {
		System.out.println("BOOK TITLE: " + bookTitle);
		System.out.println("PRICE: " + price);
		System.out.println("STOCK: " + stock);
		author.print();
	}

	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price) {

		if (price < 0) {
			this.price = 0;
			System.out.println("Note: Price should be positive! Set to 0");
		} else {
			this.price = price;
		}

	}	
	
	public int getStock()
	{
		return stock;
	}
	
	public void setStock(int stock) {

		if (stock < 0) {
			this.stock = 0;
			System.out.println("Book stocks cannot be negative! Set to 0");
		} else {
			this.stock = stock;
		}

	}
	
	public Author getAuthor()
	{
		return author;
	}

}
