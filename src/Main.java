import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if(number<0){
                System.out.print("The number is not palindrome");
                return;
            }
            int reverse = 0;
            int temp = number;
            while(temp != 0){
               int digit = (int)(temp %10);
               reverse = reverse * 10 + digit;
               temp =temp/10;
            }
            if(reverse == number) {
                System.out.print("The number is palindrome");
            }else{
                System.out.print("The number is not palindrome");
            }
    }
}