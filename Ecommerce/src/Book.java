/* Author-Sudha
 * Date-03/11/22
 * Description-The Book Class – will inherit from Product Class
 * */
public class Book extends Product {
	//Atttributes
		private String author ;
		private String genre ;
		private String isbn;
	//Constructor
		
	public Book(String name, double price, int quantity,String author) {
		super(name, price, quantity);
		this.author=author;
	}
	
	//constructor
	
	public Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}


// Method to get details of the book

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("We sell bookson Software development");
		
	}

}
