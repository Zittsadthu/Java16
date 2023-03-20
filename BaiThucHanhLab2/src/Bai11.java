import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kichthuocmang;
        int nTrunggian;
        do{
            System.out.print("Nhap kich thuoc mang ma ban muon: ");
            kichthuocmang = sc. nextInt();
        }while(kichthuocmang < 0);
        int arrA[] = new int[kichthuocmang];
        System.out.print("Nhap so nguyen vao mang: ");
        for(int i = 0; i < kichthuocmang; i++){
            System.out.printf("A[%d]: ", i);
            arrA[i] = sc.nextInt();
        }
        
        for(int i = 0; i < kichthuocmang - 1; i++){
            for(int j = i + 1; j <= kichthuocmang - 1; j++){
                if(arrA[i] > arrA[j]){
                    nTrunggian = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = nTrunggian;
                }
            }   
        }
        for(int i = 0; i < kichthuocmang; i++){
            System.out.print(arrA[i]+ "\t");
        }
    }
}
