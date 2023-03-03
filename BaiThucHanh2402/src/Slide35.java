import java.util.Scanner;

public class Slide35 {
    public int a, b;

    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)) {
        System.out.println("Nhap so a: ");
        int a = sc.nextInt();

        System.out.println("Nhap so b: ");
        int b = sc.nextInt();

        if (a>b)
            System.out.println("So nho hon la: " +b);
        else
            System.out.println("So nho hon la: " +a);
        }
    }
}
