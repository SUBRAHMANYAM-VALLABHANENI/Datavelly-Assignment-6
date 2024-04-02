import java.util.Scanner;
public class discountcal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter quantity of purchased items: ");
        int quantityPurchased=sc.nextInt();
        System.out.print("Enter the price per item: ");
        double pricePerItem = sc.nextDouble();
        double totalExpenses = quantityPurchased * pricePerItem;
        double discount = 0.0;
        if (quantityPurchased>50)
        {
            discount = 0.10 * totalExpenses;
        }
        else if(quantityPurchased<=50 && quantityPurchased>=25){
            discount = 0.5 * totalExpenses;
        }
        else
        {
            System.out.println("no discount offered");
        }
        totalExpenses = totalExpenses-discount;

        System.out.println("Total expenses after discount: Rs. " + totalExpenses);
    }
}