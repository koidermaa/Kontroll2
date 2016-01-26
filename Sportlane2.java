package KT2;

import java.util.Arrays;

/**
 * Created by Kristo on 25/01/2016.
 */
public class Sportlane2 {

    public static void main (String[] args) {
        System.out.println (score (new int[]{4, 1, 2, 3, 0})); // 9
        // Your tests here
    }

    public static int score (int[] points) {
        int [] points2 = new int [points.length];

        for (int i = 0; i < points.length; i++) {
            points2 [i] = points [i];
        }

        int sum = 0;

       for (int j = 0; j < points.length ; j++) {

        for (int i = 0; i <points.length-1; i++) {
            if (points2[i]> points2[i+1]){
                int temp = points2[i];
                points2[i] = points2[i+1];
                points2[i+1]=temp;
            }
        }
        }

        for (int i = 2; i < points.length ; i++) {
            sum += points2[i];
        }

        return sum;
    }

}

