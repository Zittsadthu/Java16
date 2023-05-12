package Sets;

import java.util.HashSet;
import java.util.Scanner;
import Sets.StudentSet;;

public class HashSetDemo  extends StudentSet{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<StudentSet> StudentHashSet = new HashSet<>();
		int a=1;
		while(a==1) {
		System.out.println("\n1.Thêm Thông Tin.");
		System.out.println("2.Hiển Thị Thông Tin.");
		System.out.println("3.Sửa Thông Tin.");
		System.out.println("4.Xóa Thông Tin");
		int luachon;
		do {
			System.out.println("Nhập vào lựa chọn:");
			luachon=sc.nextInt();
			
		}while((luachon<=0)||(luachon>4));
		switch (luachon) {
            case 1:
                 ThemThongTin(StudentHashSet);
                 break;
            case 2:
                 if (StudentHashSet.isEmpty()) {
                      System.out.println("Empty info");
                 } else {
                      CapNhat(StudentHashSet);
                 }
                 break;
            case 3:
                 if (StudentHashSet.isEmpty()) {
                      System.out.println("Empty info");
                 } else {
                      Xoa(StudentHashSet);
                 }
                 break;
            case 4:
                 if (StudentHashSet.isEmpty()) {
                      System.out.println("Empty info");
                 } else {
                      HienThi(StudentHashSet);
                 }
                 break;
            default:
                 System.out.println("wrong data input !");
       }
  }
}
}
