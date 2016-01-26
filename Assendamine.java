package KT2;

/**
 * Created by Kristo on 25/01/2016.
 */
public class Assendamine {
    public static void main(String[] args) {
        String s = "Tere, TUDENG,   tore Arvuti sul!";
        String t = asenda(s);
        System.out.println(s + " > " + t);

    }

    private static String asenda(String s) {
        String asenda ="";
        for (int i = 0; i <s.length() ; i++) {
            if (Character.isWhitespace(s.charAt(i))){       //isUppercase veel näiteks jne
                asenda += "-";
            } else {
                asenda += s.charAt(i);
            }
        }
        return asenda;
    }

}
