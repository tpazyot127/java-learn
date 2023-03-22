package BaiThucHanhLab2.src;

import java.util.Scanner;

public class Bai12 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int row, column, max = 0;

    do {
      System.out.println("Nhap vao so dong cua mang: ");
      row = scanner.nextInt();
    } while (row <= 0);

    do {
      System.out.println("Nhap vao so cot cua mang: ");
      column = scanner.nextInt();
    } while (column <= 0);

    int arr[][] = new int[row][column];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.printf("Nhap vao gia tri phan tu cua mang A[%d][%d]: ", i, j);
        arr[i][j] = scanner.nextInt();
      }
    }

    max = arr[0][0];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        if (max < arr[i][j]) {
          max = arr[i][j];
        }
      }
    }
    System.out.println("Phan tu co gia tri lon nhat trong mang la: " + max);

  }

}
