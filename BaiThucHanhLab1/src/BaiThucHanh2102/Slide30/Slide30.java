package BaiThucHanh2102.Slide30;
 
import java.util.Scanner;
 
public class Slide30 {
 
    public static void main(String[] args) {
        int number, balance;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Input int: ");
        number = scanner.nextInt();
         
        while (number <= 0) {
            System.out.println("Int must be greater than 0: ");
            number = scanner.nextInt();
        }
         
        while (number > 0) {
            balance = number % 10;
            sum += balance;
            number /= 10;
        }
         
        System.out.println("the sum character is = " + sum);
    }
 
}