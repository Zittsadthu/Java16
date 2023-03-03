import java.util.Scanner;

public class Slide30 {

    public static int soDu, TongCacSo, n;
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Nhap so n: ");
            int n = sc.nextInt();

        while (n>0){
            soDu = n % 10;
            n = n/10;
            TongCacSo += soDu;
        }
            System.out.println("Tong cac so cua chu so n la: " +TongCacSo);
           
        }
    }
}

