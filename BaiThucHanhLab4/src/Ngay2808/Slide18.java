package Ngay2808;

import java.util.ArrayList;
import java.util.Iterator;

public class Slide18 {
    public static void main(String[] args) {
        ArrayList<Float> arrayListFloat = new ArrayList<>();

        arrayListFloat.add(0.7f);
        arrayListFloat.add(7.26f);
        arrayListFloat.add(1.02f);
        arrayListFloat.add(9.3f);

        Iterator<Float> iterator = arrayListFloat.iterator();

        System.out.println("Cac phan tu co trong arrListFloat la: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }
}
