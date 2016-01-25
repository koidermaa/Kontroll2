package KT2;

import java.util.Arrays;

public class KT2 {

    public static void main(String[] args) {
        int[][]res= liitmisTabel(9);
        // System.out.println(Arrays.toString(res[1]));
    }

    private static int[][] liitmisTabel(int n) {
        int [][] tulemus = new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                tulemus [i][j] = i+j;
            }
        }
        return tulemus;
    }
}
