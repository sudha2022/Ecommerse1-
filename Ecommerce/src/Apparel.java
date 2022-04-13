/* Author-Sudha
 * Date-03/11/22
 * Description-The Apparel Class – will inherit from Product Class
 * */
public class Apparel extends Product  {

	// Attributes
	char size ;
	String color;
	// Constructor

	public Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
		this.size = size;
		this.color = color;
	}

	// Creating the method
	@Override
	public void getDetails() {

		System.out.println("We sell different kinds of cloth for both men and women");
	}

}
