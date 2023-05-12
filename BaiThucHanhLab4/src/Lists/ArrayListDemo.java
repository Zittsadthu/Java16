package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo extends StudentList{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<StudentList> StudentArrList= new ArrayList<>();
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
		switch(luachon){
            case 1: ThemThongTin(StudentArrList); break;
            case 2:
                 if(StudentArrList.isEmpty()){
                      System.out.println("Empty info");
                 }else{
                      CapNhat(StudentArrList);
                 }
                 break;
            case 3:
                 if(StudentArrList.isEmpty()){
                      System.out.println("Empty info");
                 }else{
                      Xoa(StudentArrList);
                 }
                 break;
            case 4: HienThi(StudentArrList); break;
            default:
                 System.out.println("Wrong data input!");
            }
        }
    }
}
