import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------SHOPPING-----------------");
        ShoppingCart cart = new ShoppingCart(10);

        boolean continueToShop = true;

        do{

            System.out.print("Enter the product name: ");
            String name = scan.next();
            System.out.print("Enter the product cost: ");
            double price = scan.nextDouble();
            System.out.print("Enter the quantity: ");
            cart.addToCart(name, price, scan.nextInt());

            System.out.println("\n------YOUR CART------");

            for(int i = 0; i < cart.getCart().length; i++){
                if(cart.getCart()[i] != null){
                    System.out.println(cart.getCart()[i]);
                }
            }

            System.out.println("---------------------");

            System.out.print("Enter y to continue shopping, or n to finish.");
            continueToShop = scan.next().toUpperCase().equals("Y");
        }while(continueToShop);

        System.out.println("\nPlease Pay $" + cart.getCost());
    }
}