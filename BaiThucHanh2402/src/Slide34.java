import java.util.Scanner;

public class Slide34 {
    public int a, b, c;
    public static double delta, x1, x2;

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner (System.in)){
        System.out.println("Nhap so a: ");
        int a = sc.nextInt();

        System.out.println("Nhap so b: ");
        int b = sc.nextInt();

        System.out.println("Nhap so c: ");
        int c = sc.nextInt();

        delta = Math.pow(b,2)-4*a*c;

        if (delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        }else if (delta == 0) {
            x1 = x2 = -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep la: " +x1); 
        }else {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);

            System.out.println("Phuong trinh co hai nghiem x1 la: " +x1);
            System.out.println("Va x2 la:" +x2);
            }
        }
    }
}
