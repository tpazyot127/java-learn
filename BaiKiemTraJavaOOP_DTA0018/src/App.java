
package Student;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList<Student> stdArr = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        Student std = new Student();

        System.out.print("input number of students ");
        int n = sc.nextInt();

        std.ThemThongTin(stdArr, n);
        std.HienThi(stdArr);
        std.SuaThongTin(stdArr);
        std.TimKiem(stdArr);
        std.XoaThongTin(stdArr);
        sc.close();
    }
}