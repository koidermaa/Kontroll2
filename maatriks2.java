package KT2;

import java.util.Arrays;

/**
 * Koostage Java meetod, mis genereerib parameetrina etteantud n
 * järgi niisuguse n korda n täisarvumaatriksi, mille iga elemendi väärtuseks
 * on selle elemendi reaindeksi ja veeruindeksi summa ruut (indeksid algavad nullist).
 */
public class maatriks2 {


    public static void main (String[] args) {
        int[][] res = muster (9);
    }

    public static int[][] muster (int n) {
        int [][] tulemus = new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                tulemus [i][j] = (i+j)*(i+j);
            }
        }
        return tulemus;
    }
}
