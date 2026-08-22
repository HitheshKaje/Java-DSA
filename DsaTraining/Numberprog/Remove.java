import java.util.Scanner;
public class Remove {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int last = number % 10;
        System.out.println("The last digit of the number is: " + last);
        int remove = number / 10;
        System.out.println("The number after removing the last digit is: " + remove);
        
        
    }
    
}
