import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sChuoi;
        int nKytuhoa = 0, nKytuthuong = 0, nKytuso = 0;
        System.out.print("Nhap chuoi ma ban muon: ");
        sChuoi = sc.nextLine();
        
        for(int i = 0; i < sChuoi.length(); i++){
            if(Character.isDigit(sChuoi.charAt(i))){
                nKytuso++;
            }
            if(Character.isLowerCase(sChuoi.charAt(i))){
                nKytuthuong++;
            }
            if(Character.isUpperCase(sChuoi.charAt(i))){
                nKytuhoa++;
            }
        }
        System.out.print("Ky tu in hoa co trong chuoi ma ban vua nhap la: " +nKytuhoa);
        System.out.print("\nKy tu in thuong co trong chuoi ma ban vua nhap la: " +nKytuthuong);
        System.out.print("\nKy tu so co trong chuoi ma ban vua nhap la: " +nKytuso);
    }
}
