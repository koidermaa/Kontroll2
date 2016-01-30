package Main;

/**
 * Created by Kristo on 27/01/2016.
 */
public class KT1 {

        public static void main (String[] args) {
            System.out.println (absvdeSumma (0., 0.));
            // YOUR TESTS HERE
        }

        public static double absvdeSumma (double a, double b) {

            double absa = Math.abs(a);
            double absb = Math.abs(b);
            double sum = absa + absb;

            return sum;  // TODO!!! YOUR PROGRAM HERE
        }
}
