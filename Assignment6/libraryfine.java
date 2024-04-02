import java.util.Scanner;
public class libraryfine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of days after the due book is returned:");
        int late=sc.nextInt();
        if(late<=7)
        {
            System.out.println("fine is 50 paise");
        }
        else if(late>=8 && late<=14){
            System.out.println("fine is 1 rupee");
        }
        else if(late>14 && late<=21)
        {
            System.out.println("fine is 5 rupees");
        }
        else{
            System.out.println("your membership will be cancelled");
        }
    }
}