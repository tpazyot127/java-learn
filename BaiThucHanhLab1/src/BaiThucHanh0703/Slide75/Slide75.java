package BaiThucHanh0703.Slide75;

import java.util.Scanner;

public class Slide75 {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    public static void main(String[] args) {

        System.out.println("Mời bạn nhập số: ");
        int[][] matrixNumber = {
            {1, 2, 3, 0}, 
            {4, 5, 6, 9}, 
            {7, 2, 5, 5}
        };
        
       
        TinhMangHaiChieu(matrixNumber);
    }

    public static int TinhMangHaiChieu(int[] matrix) {
        int total = 0;
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++) {
                if(matrix[row][column]%2 == 0) total += matrix[row][column];
            }
        }
    return total;
    }
}

}