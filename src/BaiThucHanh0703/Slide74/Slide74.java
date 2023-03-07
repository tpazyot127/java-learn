package BaiThucHanh0703.Slide74;
 
import java.util.Scanner;

public class Slide74 {
    // private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Mời bạn nhập số: ");
        int[] inputNumber = {1,2,3,4,5,6,7,8,9,10,11};
        
       
        TinhMangMotChieu(inputNumber);
    }

    public static int TinhMangMotChieu(int[] number) {
        int sum = 0;
        for(int i = 0; i < number.length; i++) {
            if(number[i]%2 == 0) sum += number[i];
        }
    return sum;
    }
}