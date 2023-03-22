package BaiThucHanh2102.Slide55;

import java.util.Scanner;

public class Slide55 {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Các số chia hết cho 5 là: ");
         
    for (int i = 0; i <= 20; i++) {
        if (i % 5 != 0) {
            continue;
        }
             
        System.out.println(i);
    }
}

}