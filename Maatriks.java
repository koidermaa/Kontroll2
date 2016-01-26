package KT2;

import java.util.Arrays;

public class Maatriks {

    public static void main (String[] args) {
        int[] res = veeruMaxid (new int[][] { {1,2,6}, {4,5,3} }); // {4, 5, 6}
        System.out.println(Arrays.toString(res));

    }

    public static int[] veeruMaxid (int[][] m) {
      int pikkus = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i].length > pikkus){
                pikkus = m[i].length;
            }
        }

        int [] vastus = new int [pikkus];
        for (int i = 0; i <vastus.length; i++) {
            vastus [i]= Integer.MIN_VALUE;
        }

        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[i].length; j++) {
                vastus [j] = Math.max(m[i][j], vastus [j]);
            }
        }
        return vastus;


    }
}
