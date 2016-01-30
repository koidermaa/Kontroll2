package Main;

/**
 * Kirjuta funktsioon valiVahemik, mis võtab ühe int tüüpi argumendi ja tagastab:
 Arvu 0 kui argument oli väiksem kui 10
 Arvu 1 kui argument oli vahemikus 10 - 35
 Arvu 2 kui argument oli suuem kui 35
 */
public class KT11 {

    public static void main (String[] args) {
        System.out.println (valiVahemik (0));
        // YOUR TESTS HERE
    }

    public static int valiVahemik (int m) {
        if (m < 10) {
            return 0;
        } else if (m <= 35 && m >= 10) {
            return 1;
        } else {
            return 2;
        }
    }

}
