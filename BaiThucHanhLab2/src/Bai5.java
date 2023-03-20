import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int nA, nTong = 0;
            
            do{
            System.out.print("Nhap so nguyen: ");
            nA = sc.nextInt();
            nTong += nA;
            }while(nTong < 100);
            
            System.out.print("Tong cua cac so nguyen vua nhap la: " +nTong);
        }
    }
}
