import java.util.Scanner;
public class num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        char choice;
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            sum += number;
            count++;

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y');

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Average of all numbers entered: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
        sc.close();
    }
}