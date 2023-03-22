package BaiThucHanh0703.Slide81;
 
import java.util.Scanner;

public class Slide81 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int m, n;
         
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("input so hang: ");
    m = scanner.nextInt();
    System.out.println("input so cot: ");
    n = scanner.nextInt();
         
    int A[][] = new int[m][n];
         
    System.out.println("input phan tu : ");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("A[" + i + "]["+ j + "] = ");
            A[i][j] = scanner.nextInt();
        }
    }
         

    int max = A[0][0];
         
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (max < A[i][j]) {
                max = A[i][j];
            }
        }
    }
         
    System.out.println("Phan tu lon nhat = " + max);
    

}
}
