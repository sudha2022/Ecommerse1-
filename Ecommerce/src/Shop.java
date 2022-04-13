/*Author-Sudha

 * Date-03/11/22
 * Description-ExtraCredit with Try catch exception
 * */
import java.util.Scanner;
public class Shop {
	//Attributes
	static double totalAmount=0;
	//ClassName[] arrayName = {new ClassName(parameters), new 
	//ClassName(parameters)…


	static Product [] inventory =  {new Book ("My First AWS Book", 25.99, 100, "Krishna", "non-fiction", "4SECVE12345"),
			new Book ("My Firstjava Book", 30.99, 200, "Maleeha" ),
			new Apparel("Shortsleeve", 12.99, 500, 'M', "Blue"),
			new Bath("Shampoos", 8.99, 100)};



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
	}
		//return false;

	
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
			if (userInput>=0 && userInput<4) {


				Product products = inventory[userInput];
				
			try {
				 products. buy() ;
				 

					System.out.println("Your purchase is successfull:");
					totalAmount = totalAmount+products.getPrice();

				}catch (ArrayIndexOutOfBoundsException e){
					System.out.println("“Sorry! This product is out of stock:");
					break;
				}
			}

		}while(userInput>=0 && userInput<4);

		System.out.println("Thank you for shopping with us! the totalAmount is:" + totalAmount);

sc.close();
		}
}
	
		
		


		
		
	
	
	
































