/*Author-Sudha
 * Date-03/07/22
 * Description-implementing a Product Class that’s a blueprint 
    of e-commerce product’s attributes and behaviors.
    To create an array of objects
 * */
import java.util.Scanner;
public class Shop1 {
	//Attributes
	static double totalAmount=0;
	//ClassName[] arrayName = {new ClassName(parameters), new 
	//ClassName(parameters)…
	static Product2 [] inventory = {new Product2 ("Business Ritual Women's Long Sleeve Top",65.39, "Apparel",4,'L',"Blue"),
			new Product2("The Art ofComputer Programming ",190.54,"Books",9,"Donald E. Knuth"),
			new Product2("Men’s Business Casual Shirt", 57.10,"Apparel",2,'M',"Teal"),
			new Product2("Organic Turmeric Soap",11.25,"Bath & Beauty",1),
			new Product2("Head First Design Pattern",37.35,"Books",3,"Eric Freeman")};
	//Method
	public static void displayMenu() {
		System.out.println("nEnter the product index (0 to 4) you \r\n"
				+ "want to buy. To exit the shopping cart, enter any number \r\n"
				+ "other than 0 to 4");

		//String menu= "new Product[0]\n" + "new Product[1]\n" +" new Product[2]\n" + "new Product[3]\n" +" new Product[4]\n";			
		for (int i =0; i<inventory.length;i++) {
			//System.out.println("Product Index:" + inventory[i].getName() );
			System.out.println(i+":" + inventory[i].getName());
		}
		//return false;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput;
		int quantity;


		do {

			displayMenu();
			//userInput = sc.nextInt();
			System.out.println("nEnter the product index (0 to 4) you \r\n"
					+ "want to buy. To exit the shopping cart, enter any number \r\n"
					+ "other than 0 to 4");
			userInput = sc.nextInt();

			//using if condition		
			if (userInput>=0 && userInput<=4) {


				Product2 products = inventory[userInput];
				if( products. buy()==true ){

					System.out.println("Your purchase is successfull:");
					totalAmount = totalAmount+products.getPrice();
					
				}else {
					System.out.println("“Sorry! This product is out of stock:");
					break;
				}


			}

		}while(userInput>=0 && userInput<=4);

		System.out.println("Thank you for shopping with us! the totalAmount is:" + totalAmount);



		sc.close();
	}
}












