import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sChuoi;
        int nDem = 0;
        char cKytu;
        do{
            System.out.print("Nhap chuoi ma ban muon: ");
            sChuoi = sc.nextLine();
        }while(sChuoi.length() > 80);
        System.out.print("Nhap ky tu ma ban muon kiem tra: ");
        cKytu = sc.next().charAt(0);
        for(int i = 0; i < sChuoi.length(); i++){
            if(sChuoi.charAt(i) == cKytu){
                nDem++;
            }
        }
        System.out.printf("So lan xuat hien ky tu %s la: %d", cKytu, nDem);
    }
}
