package KT2;

import java.util.Arrays;

public class Sportlane {
    public static void main(String[] args) {
        System.out.println(result(new double[]{0.,1.,2.,3.,4.}));
    }

    private static double result(double[] marks) {
        Arrays.sort(marks);
        double sum = 0;
        double vastus = 0;

        for (int i = 1; i <marks.length-1; i++) {
            sum += marks[i];
        }
        vastus = sum / (marks.length-2);
        System.out.println(vastus);
        return vastus;
    }


}
