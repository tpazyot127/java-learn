package BaiThucHanh2802.Slide40;
 
import java.util.Scanner;

public class Slide40 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Mời bạn nhập số: ");
        inputNumber = Slide40.scanner.nextInt();
        
       
        Slide40.RenderNgay(inputNumber);
    }

    public static void RenderNgay(int number) {
        if(number < 1 || number > 7) {
            System.out.println('hãy nhập số khác trong khoảng 1 tới 7 ');
        }
        switch (inputNumber >= 1 && inputNumber <= 7) {
            case 1:
            System.out.println('Thứ hai ');
            case 2:
            System.out.println('Thứ ba ');
                break;
            case 3:
            System.out.println('Thứ tư ');
                break;
            case 4:
            System.out.println('Thứ năm ');
                break;
            case 5:
            System.out.println('Thứ sáu ');
                break;
            case 6:
            System.out.println('Thứ bảy ');
                break;
            default:
                System.out.println("Chủ nhật ");
            }
            
    }

}