import java.util.Scanner;
class empbonus{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int currentYear=sc.nextInt();
        int yearOfJoining=sc.nextInt();
        int diff=currentYear-yearOfJoining;
        if(diff>5)
        {
            System.out.println("bonus=5000/-");
        }
        else if(diff<=5 &&diff>=3)
        {
            System.out.println("bonus=3000/-");
        }
        else{
            System.out.println("no bonus is awarded" );
        }
    }
}