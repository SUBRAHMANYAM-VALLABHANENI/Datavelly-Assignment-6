import java.util.Scanner;
public class vowelcheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        int vowelCount = 0;
        boolean isVowelPresent = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                isVowelPresent = true;
                vowelCount++;
            }
        }

        if (isVowelPresent) {
            System.out.println("Vowels are present.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present.");
        }
    }
}