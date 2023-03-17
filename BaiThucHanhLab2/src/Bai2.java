import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) throws Exception{
        try(Scanner sc = new Scanner(System.in)){
            int nSo1;
            System.out.print("Nhap vao so ma ban muon kiem tra: ");
            nSo1 = sc.nextInt();

            if(nSo1 % 2 ==0){
                System.out.print("So ma ban vua nhap la so chan");
            }else{
                System.out.print("So ma ban vua nhap la so le");
            }
        }
    }
}
