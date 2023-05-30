package Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DTA018STUDENT {
    Scanner sc = new Scanner(System.in);
    public String FullName;
    public int index;
    public Float score;
    public int i; 

    public void HienThi (List <Student > stdArr) {
        for (i = 0; i < stdArr.size(); i++) {
            System.out.println("student name is : " + stdArr.get(i).fullName);
            System.out.println("student index is : " + stdArr.get(i).index);
            System.out.println("student score is : " + stdArr.get(i).score);
        }
    }
    public void NhapThongTin()  {
        System.out.println("Please enter the full name , ");
        fullName = sc.nextLine();
        System.out.println("Please enter the index : ");
        index = sc.nextInt();
        System.out.println("Please enter the score : ");
        score = sc.nextFloat();
    }

    public void ThemThongTin  ( List <Student> stdArr) {
       for (i = 0; i < n; i++) {
            std.NhapThongTin();
            stdArr.add(std);
            
        }
    }
    
    public void SuaThongTin(List<Student> stdArr) {
        System.out.println("Please enter a index your wanna fix");
        int index = sc.nextInt();
        Student std = new Student();
        for (int i = 0; i < stdArr.size(); i++) {
            if (i + 1 == stt) {
                std.NhapThongTin();
                stdArr.set(i, std);
                std.HienThi(stdList);
            }
        }
    }
    
    public void XoaThongTin(List<Student> stdArr) {
        System.out.println("Please enter a index your wanna delete");
        int index = sc.nextInt();
        Student std = new Student();
        for (int i = 0; i < stdArr.size(); i++) {
            if (i + 1 == stt) {
                std.NhapThongTin();
                stdArr.remove(i, std);
                std.HienThi(stdArr);
            }
        }
    }

    public void TimKiem(List<Student> stdArr) {
        System.out.println("Please enter a index your wanna find");
        int index = sc.nextInt();
        Student std = new Student();
        for (int i = 0; i < stdArr.size(); i++) {
            if (i + 1 == stt) {
                std.NhapThongTin();
                stdAr.get(i, std);
                std.HienThi(stdArr);
            }
        }
    }
}