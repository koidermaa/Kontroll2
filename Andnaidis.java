package Main;

import java.util.ArrayList;

public class Andnaidis {
    public static void main(String[] args) {

        int x, y;
        x = 10;
        y = -8;
        if (x > 0 && y > 0) {    // tähendab AND
            System.out.println("both number positive");
        } else if (x > 0 || y > 0) {    // US keyboard backspace alt  tähendab OR
            System.out.println("one is positive");
        } else {
            System.out.println("both negative ");
        }

        int z = 11;
        switch (z) {
            case 12:
                System.out.println("sobib");
                break;
            default:
                System.out.println("ei sobi õõõõ");
                break;
        }

        int[] a = {10, 20, 30, 40, 50};  //array
        System.out.println(a[2] + " " + a[4]);   //prindib 3nda ja 5nda numbri

        int arv = 10;
        int tulemus = liidaYks(arv);  //kasutab methodit, mis allpool toodud
        System.out.println(tulemus);

        ArrayList ab = new ArrayList();
        ab.add(23);
        ab.add(17);
        System.out.println(ab.toString());


    }


        public static int liidaYks (int a){
            return a +1;
        }




}
