/*Author-Sudha
 * Date-03/11/22
 * Description-) To create an abstract class and understand the concept of inheritance
 * modifying your Ecommerce project to include 
   inheritance. Your Product class will now be abstract.
 * */
// Attributes
public abstract class Product {

	//Creating Attributes

	private	 String name ;
	private double price;
	private int quantity ;


	// Creating Constructors
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	//Creating buy method

	boolean buy() {
		if(quantity>0) {
			this.quantity--;
			return true;

		}
		else {
			return false;
		}
	}

	public abstract void getDetails();


}











