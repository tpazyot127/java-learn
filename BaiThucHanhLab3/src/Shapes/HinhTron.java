package Shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
  private static final int PI = 0;
  public float bankinh;
  Scanner sc = new Scanner(System.in);

  public HinhTron() {
    String ten = "Hinh Tron";
  }

  public void nhapbankinh() {
    System.out.print("Ban kinh = ");
    bankinh = sc.nextFloat();
  }

  public void tinhchuvi() {
    Object chuvi = 2 * PI * bankinh;
  }

  public void tinhdientich() {
    Object dientich = PI * bankinh * bankinh;
  }
}
