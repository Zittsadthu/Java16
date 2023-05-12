package Lists;

import java.util.List;
import java.util.Scanner;

public class StudentList {
    public String FullName;
    public int Age;

    public String getFullName() {
         return FullName;
    }

    public void NhapThongTin() {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter full name: ");
         FullName = sc.nextLine();
         System.out.print("Enter age: ");
         Age = sc.nextInt();
    }

    public static void ThemThongTin(List<StudentList> std) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap so luong Student :");
         int n = sc.nextInt();
         for (int i = 0; i < n; i++) {
              StudentList hs = new StudentList();
              hs.NhapThongTin();
              std.add(hs);
              System.out.println("Success");
         }
    }

    public static void HienThi(List<StudentList> std) {
         
         for (int i = 0; i < std.size(); i++) {
              System.out.println("[Student :" + i + "] :\n" +
                        "Ho Va Ten :" + std.get(i).FullName +"\n"+
                        "Tuoi :" + std.get(i).Age +"\n");
         }
        
    }

    public static void CapNhat(List<StudentList> std) {
         Scanner sc = new Scanner(System.in);
         System.out.println("nhap vi tri can update :");
         int i = sc.nextInt();
         if (i >= 0 && i < std.size()) {
              StudentList hs = std.get(i);
              hs.NhapThongTin();
              std.set(i, hs);
              System.out.println("Success");
         } else {
              System.out.println("Nhap sai vi tri !");
         }
    }

    public static void Xoa(List<StudentList> std) {
       Scanner sc = new Scanner(System.in);
         System.out.println("xoa listAll nhap 2 - xoa index nhap 1");
         int sl = sc.nextInt();
         if(sl == 1){
              System.out.println("Nhap vao vi tri can xoa :");
              int i = sc.nextInt();
              if (i >= 0 && i < std.size()) {
                   std.remove(i);
                   System.out.println("Success");
              }else{
                   System.out.println("Nhap sai vi tri!");
              }
         }else if(sl == 2){
              std.clear();
              System.out.println("Success");
         }else{
              System.out.println("Wrong data input!");
         }
   }
}
