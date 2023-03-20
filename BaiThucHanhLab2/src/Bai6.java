import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int nA, nGiaiThua = 1;
            
            System.out.print("Nhap so nguyen: ");
            nA = sc.nextInt();
            for(int i = 1; i <= nA; i++){
                nGiaiThua *= i;
            }
            System.out.printf("%d!= %d", nA, nGiaiThua);
        }
    }
}
