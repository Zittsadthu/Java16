import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){ 
        try(Scanner sc = new Scanner(System.in)){
            String sHoTen;
            int nNamSinh, nTuoi;
            
            System.out.print("Nhap ten: ");
            sHoTen = sc.nextLine();
            System.out.print("Nhap nam sinh: ");
            nNamSinh = sc.nextInt();

            nTuoi = 2023 - nNamSinh;
            if (nTuoi < 16){
                System.out.printf("Ban %s o do tuoi vi thanh nien", sHoTen);
            }else if(nTuoi >= 18){
                System.out.printf("Ban %s da gia", sHoTen);
            }else{
                System.out.printf("Ban %s dang o do tuoi truong thanh", sHoTen);
            }
        }
    }
}
