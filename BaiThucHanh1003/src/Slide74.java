import java.util.Scanner;

public class Slide74 {

    public static void main(String[] args) throws Exception {
        int kichthuocmang;
        try (Scanner sc = new Scanner(System.in)){
        do{
            System.out.print("Nhap vao kich thuoc cua mang ma ban muon: ");
            kichthuocmang = sc.nextInt();

        }while(kichthuocmang <= 0);
        int arrA[] = new int[kichthuocmang];
        System.out.print("Nhap phan tu cua mang: ");
        for(int i = 0; i < kichthuocmang; i++)
            {
            System.out.printf("A[%d]:",i);
            arrA[i] = sc.nextInt();
            }
        for(int i = 0; i < kichthuocmang; i++)
            {
                System.out.printf("%d\t", arrA[i]);
            }
            int tong = 0;
            for(int i = 0; i < kichthuocmang; i++)
            {
                if(arrA[i] % 2 == 0)
                {
                    tong += arrA[i];
                }
            }
            System.out.print("\nTong cua cac so chan trong mang la: " +tong);
        }
        
    }
}