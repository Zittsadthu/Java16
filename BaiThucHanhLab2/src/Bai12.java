import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args){
        int nDoc, nNgang;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap kich thuoc hang ngang ma ban muon: ");
            nNgang = sc.nextInt();
            System.out.print("Nhap kich thuoc hang doc ma ban muon: ");
            nDoc = sc.nextInt();
        }while(nNgang < 0 || nDoc < 0);
        int arrA[][] = new int[nNgang][nDoc];
        System.out.print("");
        for(int i = 0; i < nNgang; i++){
            for(int j = 0; j < nDoc; j++){
                System.out.printf("A[%d][%d]: ", i, j);
                arrA[i][j] = sc.nextInt();
            }
        } 
        System.out.println("Ma tran hai chieu: ");
        for(int i = 0; i < nNgang; i++){
            for(int j = 0; j < nDoc; j++){
                System.out.print("\t" +arrA[i][j]);
            }
            System.out.println("\n");
        }
        int nMax = arrA[0][0];
        for(int i = 0; i < nNgang; i++){
            for(int j = 0; j < nDoc; j++){
                if(arrA[i][j] > nMax){
                    nMax = arrA[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat trong ma tran la: " +nMax);
    }
}
