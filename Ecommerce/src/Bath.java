/* Author-Sudha
 * Date-03/11/22
 * Description-The Book Class – will inherit from Product Class
 * */
public class Bath extends Product {

	public Bath(String name, double price, int quantity) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDetails() {
		System.out.println("We sell Organic bath products!");

	}

}
