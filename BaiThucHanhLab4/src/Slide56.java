import java.util.HashSet;
import java.util.Scanner;

public class Slide56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSetString.add("Wilson");
        hashSetString.add("Willow");
        hashSetString.add("WX-78");
        hashSetString.add("Maxwel");
        hashSetString.add("Wendy");
        hashSetString.add("Wortox");

        System.out.println("Cac phan tu trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = sc.nextLine();

        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong hashSetString: ");
            System.out.println(hashSetString);
        } else {
            System.out.println("Xoa khong thanh cong!");
        }
    }
}
