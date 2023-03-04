import java.util.Scanner;

public class Slide47 {

    public static void main(String args[]){
        int n, tong=0;
        try (Scanner sc = new Scanner(System.in)){
        do{
            System.out.println("Nhap vao cac so nguyen: ");
            n = sc.nextInt();
            tong += n;     
        }
        while(tong <100);
        System.out.println("Tong cac so nguyen vua nhap la: " + tong);
        }
    }
}