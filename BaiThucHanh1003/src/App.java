import java.util.Scanner;

public class App {
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
        for(int i = 0; i < kichthuocmang - 1; i++)
            {
                for(int j = i + 1; j <= kichthuocmang - 1; j++)
                {
                    int trunggian;
                    if (arrA[i] > arrA[j])
                    {
                    trunggian = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = trunggian;
                    }
                }  
            }
        for(int i = 0; i < kichthuocmang; i++){
            System.out.printf("%d\t", arrA[i]);
        }    
        }
    }
}
